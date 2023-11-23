package com.iesam.chispas.domain.models;

public class Sales {
    private String idSales;
    private String nameSales;
    private Double priceSales;

    private IvaType ivaType;
    public String getIdSales() {
        return idSales;
    }

    public void setIdSales(String idSales) {
        this.idSales = idSales;
    }

    public String getNameSales() {
        return nameSales;
    }

    public void setNameSales(String nameSales) {
        this.nameSales = nameSales;
    }

    public Double getPriceSales() {
        return priceSales;
    }

    public void setPriceSales(Double priceSales) {
        this.priceSales = priceSales;
    }

    public IvaType getIvaType() {
        return ivaType;
    }

    public void setIvaType(IvaType ivaType) {
        this.ivaType = ivaType;
    }
}
