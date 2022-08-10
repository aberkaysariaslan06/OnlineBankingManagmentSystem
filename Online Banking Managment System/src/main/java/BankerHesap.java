/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ABRA
 */
public class BankerHesap {
    
         
	private String kullanici_adi ; 
	private String parola ; 
	
        
			
	public BankerHesap(String kullanici_adi, String parola) {
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		
                
	}
	
	public String getKullanici_adi() {
		return kullanici_adi;
	}
	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
}


