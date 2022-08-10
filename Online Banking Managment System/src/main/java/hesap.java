

public class hesap {
        public int kullanici_id ;
	private String kullanici_adi ; 
	private String parola ; 
	public int  bakiye ;
        private String advantage;
        public int loan;
			
	public hesap(int kullanici_id,String kullanici_adi, String parola, int bakiye,String advantage,int loan) {
		
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
                this.advantage = advantage;
                this.kullanici_id=kullanici_id;
                this.loan=loan;
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
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
        public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String Advantage) {
		this.advantage = Advantage;
	}  
	
	public void setloan(int loan) {
		this.loan = loan;
	}
	public String getloan() {
		return parola;
	}

	
	
}
