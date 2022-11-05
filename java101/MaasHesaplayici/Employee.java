package MaasHesaplayici;

public class Employee {

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	
	
	//constructor method
	void Employee(String name, double salary, int workHours, int hireYear){
		
		
	
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
		
		
	}
		
	
	//tax calculation
	public double tax() {
		
		if(this.salary >= 1000) {
			
		return this.salary*3/100; 

		}
		
		return 0.0;
	}
	
	
	
	//bonus calculation
	public double bonus() {
		
		int extra = this.workHours-40;
		
		if(extra>0) {
			return (30 * extra);  
		}
		return 0.0;
	}
	
	
	//raise calculation
	public double raiseSalary() {
		
		
		int year = 2021 - this.hireYear;
		if(year < 10) {
			
			return this.salary * 0.05;
			
		}else if(year <= 10 && year <20) {
			
			return this.salary * 0.10;
			
			
		}else {
			
			return this.salary * 0.15;
			
		}
	}
	
	

	
	void ToString(){
		
		
		System.out.println("Çalışanın adı: " + this.name);
		
		System.out.println("Çalışanın maaşı: " + this.salary);
		
		System.out.println("Çalışma saati: " + this.workHours);
		
		System.out.println("Başlangıç yılı: " + this.hireYear);
		
	
		System.out.println("Vergi: " + this.tax());
		
		System.out.println("Bonus: " + this.bonus());
		
		System.out.println("Maaş artışı: " + this.raiseSalary());
		
		
		double vbSalary = salary - tax() + bonus();
		System.out.println("Vergi ve bonuslarla birlikte maaş: " + vbSalary);
		
		
		double total= salary + raiseSalary() + bonus() - tax();
		System.out.println("Toplam maaş: " + total);
	}
}
