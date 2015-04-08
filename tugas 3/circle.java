public  class  circle {
	// variabel radius
	// radius -> double
	// color -> string

		double radius;
		String color;

	// konstruktor untuk class circle??
		//karena nama kelas sama dengan nama funcsngsi

		public circle(){

			radius = 1.0;
			color ="pink";
		}

		public circle(double r){
			
			radius = r;
			color ="pink";
		}
		public circle(double r,String c){
			
			radius =r;
			color =c;
		}

		public double getRadius(){
			
			return radius;

		}
		
		public String getColor(){

			return color;
		}

		public double getArea(){

			return radius*radius*Math.PI;
		}
	

	
}