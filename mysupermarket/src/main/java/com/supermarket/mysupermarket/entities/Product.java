package com.supermarket.mysupermarket.entities;

import java.io.Serializable;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String nameProduct;
	public Long codeProduct;
	public Double priceProduct;
	
	public Product() {
		
	}

	public Product(String nameProduct, Long codeProduct, Double priceProduct) {
		super();
		this.nameProduct = nameProduct;
		this.codeProduct = codeProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Long getCodeProduct() {
		return codeProduct;
	}

	public void setCodeProduct(Long codeProduct) {
		this.codeProduct = codeProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeProduct == null) ? 0 : codeProduct.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (codeProduct == null) {
			if (other.codeProduct != null)
				return false;
		} else if (!codeProduct.equals(other.codeProduct))
			return false;
		return true;
	}	

}
