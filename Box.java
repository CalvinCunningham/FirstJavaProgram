package FirstProgram;

public class Box {
   int width;
   int height;
   int depth;
   
   Box(){
	   
	  width = depth = height = -1; 
   }
   
   Box( int w, int h, int d) {
	    width  = w;
	    height = h;
	    depth  = d;
   }
   
   Box (int volume){
	  width = height = depth = volume;
	   
   }
   
   int computeVolume() {
	   return width * depth * height;
	   
   }
}
