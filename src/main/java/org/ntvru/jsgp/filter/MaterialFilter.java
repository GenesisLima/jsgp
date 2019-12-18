package org.ntvru.jsgp.filter;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.money.Monetary;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.javamoney.moneta.Money;
import org.springframework.core.annotation.Order;

@Order(1)
public class MaterialFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("Entering the Material Filter. Using Method "+req.getMethod());
		if(req.getMethod().equals("POST")) {
		if(req.getParameter("precoMedio")!=null || !req.getParameter("precoMedio").equals("")){
			try {
				req.setAttribute("precoMedio", convertStringToMoney(req.getParameter("precoMedio")));
				System.out.println("Material Filter... Value parsed");

			} catch (ParseException e) {				
				e.printStackTrace();
			}
		}
		}
		 chain.doFilter(req, response);
		
	}
	
	private Money convertStringToMoney(String value) throws ParseException {
		Locale ptBr = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getNumberInstance(ptBr);
		return Money.of(nf.parse(value), Monetary.getCurrency("BRL"));
	}

}
