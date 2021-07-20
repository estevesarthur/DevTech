package com.example.devtech;

public class MenuDevTech {
    int imgLogo;
    int imgQuemSomos;
    String quemSomos;
    int imgNossoPortfolio;
    String nossoportfolio;
    int imgContato;
    String contato;

    public MenuDevTech(int ImgLogo, int imgQuemSomos, String quemSomos, int imgNossoPortfolio, String nossoportfolio, int imgContato, String contato) {
        this.imgLogo = ImgLogo;
        this.imgQuemSomos = imgQuemSomos;
        this.quemSomos = quemSomos;
        this.imgNossoPortfolio = imgNossoPortfolio;
        this.nossoportfolio = nossoportfolio;
        this.imgContato = imgContato;
        this.contato = contato;
    }

    public int getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(int imgLogo) {
        this.imgLogo = imgLogo;
    }

    public int getImgQuemSomos() {
        return imgQuemSomos;
    }

    public void setImgQuemSomos(int imgQuemSomos) {
        this.imgQuemSomos = imgQuemSomos;
    }

    public String getQuemSomos() {
        return quemSomos;
    }

    public void setQuemSomos(String quemSomos) {
        this.quemSomos = quemSomos;
    }

    public int getImgNossoPortfolio() {
        return imgNossoPortfolio;
    }

    public void setImgNossoPortfolio(int imgNossoPortfolio) {
        this.imgNossoPortfolio = imgNossoPortfolio;
    }

    public String getNossoportfolio() {
        return nossoportfolio;
    }

    public void setNossoportfolio(String nossoportfolio) {
        this.nossoportfolio = nossoportfolio;
    }

    public int getImgContato() {
        return imgContato;
    }

    public void setImgContato(int imgContato) {
        this.imgContato = imgContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return this.imgLogo + " \n " + this.imgQuemSomos + " \n " + this.quemSomos + " \n " + this.imgNossoPortfolio + " \n " + this.nossoportfolio + " \n " + this.imgContato + " \n " + this.contato;
    }
}

