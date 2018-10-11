
public class Quadratic {

	public static String quadrDescriber(double a, double b, double c) {
		System.out.println("===========================================================================================================");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("Description of the graph of: ");
		System.out.println();
		//determines if it opens up or down
		if (a > 0) {
			System.out.println("Opens: down");
		}
		else {
			System.out.print("Opens: Up");
		}
		//finding the axis of symmetry
		double symmetry = (-(b)/(2*a));
		System.out.println("Axis of Symmetry: " + symmetry);
		//finding the vertex
		double vertexX = symmetry;
		double vertexY = ((a)*(vertexX*vertexX) + (b)*(vertexX) + c);
		System.out.println ("Vertex: (" + vertexX + "," + vertexY + ")");
		//find the discriminate for the x-intercept 
		double discriminate = ((b*b) - 4*(a)*(c));
		//square root of discriminate
		double t = 1;
		double sqrt = 0;
		double squareroot = discriminate/2;
		do 
		{
			t = squareroot;
			squareroot = ((t+ (discriminate/t))/2);
		}
		while ((t-squareroot) != 0);
		{
			sqrt = t;
		}
		//use the quadratic formula to find the x intercepts
		double negativeZero= ((-b + sqrt)/(2*a) );
		double positiveZero = ((-b - sqrt)/(2*a));
		System.out.println("x-intercept(s) : " + positiveZero  + " & " + negativeZero);
		//finding the y-intercept
		double yIntercept = c;
		System.out.println("y-intercept: (0," + c + ")");
		
		System.out.println("===========================================================================================================");
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		//add scanners in to check the user input
		//make the user input all capitals or all lower case in order to check the string
	}
}
