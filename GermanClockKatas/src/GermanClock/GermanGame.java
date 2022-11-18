package GermanClock;

import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;

public class GermanGame {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		
		Timer timer = new Timer();
		TimerTask myTask = new TimerTask() {
		    @Override
		    public void run() {
		    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();  
				
				int[] relojSegundos = {0};
				int[] firstRow = new int[4];
				int[] secondRow = {0,0,0,0};
				int[] thirdRow = {0,0,0,0,0,0,0,0,0,0};
				int[] forthRow = {0,0,0,0};
				
				int horas = now.getHour();
				int rowHorasPrimera = horas/5;
				int rowHorasSegunda = horas%5;
				
				int minutos = now.getMinute();
				int rowMinutosPrimera = minutos/5;
				int rowMinutosSegundo = minutos%2;
				// System.out.println(dtf.format(now));  
				
				if(relojSegundos[0] == 0) {relojSegundos[0] = 1;}
				if(relojSegundos[0] == 1) {relojSegundos[0] = 0;}
				
				switch(rowHorasPrimera) {
					case 1:
						firstRow[4] = 1;
					case 2:
						firstRow[4] = 1;
						firstRow[3] = 1;
					case 3:
						firstRow[4] = 1;
						firstRow[3] = 1;
						firstRow[2] = 1;
					case 4:
						firstRow[4] = 1;
						firstRow[3] = 1;
						firstRow[2] = 1;
						firstRow[1] = 1;

				}
				switch(rowHorasSegunda) {
					case 1:
						secondRow[3] = 1;
						break;
					case 2:
						secondRow[3] = 1;
						secondRow[2] = 1;
						break;
					case 3:
						secondRow[3] = 1;
						secondRow[2] = 1;
						secondRow[1] = 1;
						break;
					case 4:
						secondRow[3] = 1;
						secondRow[2] = 1;
						secondRow[1] = 1;
						secondRow[0] = 1;
						break;
					default:
						secondRow[0] = 0;
						secondRow[1] = 0;
						secondRow[2] = 0;
						secondRow[3] = 0;
				}
				
				switch(rowMinutosPrimera) {
				case 1:
					thirdRow[10] = 1;
				case 2:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
				case 3:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
				case 4:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
				case 5:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
				case 6:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
					thirdRow[6] = 1;
				case 7:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
					thirdRow[6] = 1;
					thirdRow[5] = 1;
				case 8:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
					thirdRow[6] = 1;
					thirdRow[5] = 1;
					thirdRow[4] = 1;
				case 9:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
					thirdRow[6] = 1;
					thirdRow[5] = 1;
					thirdRow[4] = 1;
					thirdRow[3] = 1;
				case 10:
					thirdRow[10] = 1;
					thirdRow[9] = 1;
					thirdRow[8] = 1;
					thirdRow[7] = 1;
					thirdRow[6] = 1;
					thirdRow[5] = 1;
					thirdRow[4] = 1;
					thirdRow[3] = 1;
					thirdRow[2] = 1;
			}
				
				
				
				System.out.println(relojSegundos[0]);
				for(int i : firstRow) { System.out.print(i + " "); }
				for(int i : secondRow) { System.out.print(i + " "); }
				
				
		    }
		};

		timer.schedule(myTask, 5000, 5000);
		
	}

}
