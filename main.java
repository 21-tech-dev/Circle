public static void main (String[] args){
		Circle mycircle = new Circle();
		mycircle.Circle(-2, 1, 5);
		System.out.println("Result: " + mycircle.isInside(1, 1));
		System.out.println("Result: " + mycircle.isInside(2, 1));
		mycircle.zoom(6);
		System.out.println("...zoom...");
		System.out.println("X: " + mycircle.coord_x);
		System.out.println("Y: " + mycircle.coord_y);
		System.out.println("Radius: " + mycircle.radius);
		
}
