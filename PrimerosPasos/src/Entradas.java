import java.util.*;
import javax.swing.*;
public class Entradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] maleatorios=new int[150];
	for(int i=0;i<maleatorios.length;i++){
		maleatorios[i]=(int)Math.round(Math.random()*100);
		System.out.println(maleatorios[i] + ", ");
	}
		
}
}

