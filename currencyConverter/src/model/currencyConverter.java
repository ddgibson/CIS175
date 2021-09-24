/**
 * @author Derek Gibson- ddgibson
 * CIS175 - Fall 2021
 * September 23, 2021
 */

package model;

public class currencyConverter {
	private double money;
	private double yen;
	private double pesos;
	private double euros;
	private double CAD;
	private double pounds;
	private double rupees;
	private double AUD;

	public currencyConverter(double money) {
		super();
		this.money = money;
		convertMoney(money);
	}
	
	public void convertMoney(double money) {
		convertYen(money);
		convertPesos(money);
		convertEuros(money);
		convertAUD(money);
		convertCAD(money);
		convertGBP(money);
		convertRupees(money);
	}
	
	private void convertYen(double yen) {
		this.yen = money * 110.37;
	}
	
	private void convertPesos(double pesos) {
		this.pesos = money * 20.068;
	}
	private void convertEuros(double euros) {
		this.euros = money * 0.85182;
	}
	private void convertCAD(double CAD) {
		this.CAD = money * 1.2664;
	}
	private void convertGBP(double pounds) {
		this.pounds = money * 0.72880;
	}
	private void convertAUD(double AUD) {
		this.AUD = money * 1.3706;
	}
	
	private void convertRupees(double rupees) {
		this.rupees = money * 73.847;
	}
	
	public double getYen() {
		return yen;
	}
	
	public double getPesos() {
		return pesos;
	}
	
	public double getEuros() {
		return euros;
	}
	
	public double getCAD() {
		return CAD;
	}
	
	public double getGBP() {
		return pounds;
	}
	
	public double getAUD() {
		return AUD;
	}
	
	public double getRupees() {
		return rupees;
	}
	
	@Override
	public String toString() {
		return "Your dollar amount: " + money + " --- "
				+ "In Yen: " + yen + " --- "
						+ "In Pesos: " + pesos +
				" --- "
				+ "In Euros: " + euros + "---"
						+ "In Canadian Dollars: " + CAD + " --- "
								+ "In pounds: " + pounds +
				" --- "
				+ "In Australian Dollars: " + AUD + " --- "
						+ "In Rupees: " + rupees + ".";
	}
}
