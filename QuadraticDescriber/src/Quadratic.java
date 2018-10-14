import java.util.*;
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {

		//variables
		Scanner userinput = new Scanner(System.in);
		double symmetry = 0;
		double vertexX = 0;
		double vertexY = 0;
		double x_subtract = 0;
		double x_addition = 0;
		String xintercepts = "";
		double yIntercept = 0;
		String opens = "";
	
		//user input for variables a, b, c
		System.out.print("a :" );
		a = userinput.nextInt();
		System.out.print("b :" );
		b = userinput.nextInt();
		System.out.print("c :" );
		c = userinput.nextInt();
		
		//determines if it opens up or down
		if (a < 0) {
			opens = "Down";
		}
		else {
			opens = "Up";
		}
		
		//finding the axis of symmetry
		symmetry = (-(b)/(2*a));
		
		//finding the vertex
		vertexX = symmetry;
		vertexY = ((a)*(vertexX*vertexX) + (b)*(vertexX) + c);
			
		//find the x-intercept(s) 
		x_subtract =(((-b) - (Math.sqrt((b*b)-(4*a*c))))/(2*a));
		x_addition =(((-b) + (Math.sqrt((b*b)-(4*a*c))))/(2*a));
		if (x_subtract == x_addition) {
			xintercepts =("" + x_subtract);
		}
		else {
			xintercepts =(x_subtract + " & " + x_addition);
		}
		
		//finding the y-intercept
		yIntercept = c;
		
		String description = ("===================================================================================================" + "\n"
				 + "Description of the graph of: \n"
				 + "y = (" + a + ")x^2 + (" + b + ")x + (" + c +") \n\n"
				 + "Opens: " + opens + "\n"
				 + "Axis of Symmetry: " + symmetry + "\n"
				 + "Vertex: (" + vertexX + "," + vertexY + ")" + "\n"
				 + "x-intercept(s): " + xintercepts +"\n"
				 + "y-intercept: " + yIntercept+ "\n"
				 + "===================================================================================================");
	return (description);
	}
}
