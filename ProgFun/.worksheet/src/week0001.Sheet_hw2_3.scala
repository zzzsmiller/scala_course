package week0001

object Sheet_hw2_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 
	
	var n = 10;System.out.println("""n  : Int = """ + $show(n ));$skip(32); ;
	var count = new Array[Int](n);System.out.println("""count  : Array[Int] = """ + $show(count ));$skip(15); ;
	var nvar = 0;System.out.println("""nvar  : Int = """ + $show(nvar ));$skip(30); ;
	
	var coins = List(2, 1, 3);System.out.println("""coins  : List[Int] = """ + $show(coins ));$skip(1075); ;
	
	def change( maxcoin:Int, sum:Int ):Int = {
	//	int sum;        /* монета, которую меняем */
	//	int maxcoin;
	  /* индекс по массиву cost[] монеты максимального
				 * достоинства, допустимой в данном размене.
				 */
	
		//register i;
	
		if( sum == 0 ){  /* вся сумма разменяна */
			/* распечатать очередной вариант */
			/*
			println( '|' );
			for( i <- n-1 to 0 by 1 ) {
				if( count(i) != 0 )
				    printf(" %3d |", count[ i ] );
				else
				    printf("     |" );
	    }
			putchar( '\n' );
			*/
			nvar += 1;
			return nvar;
			
		}
		if( sum >= coins(maxcoin) ){
		    /* если можно выдать монету достоинством cost[maxcoin] ,
		     * то выдать ее:
		     */
		    count(maxcoin) += 1;   /* посчитали выданную монету */
	
	       /* размениваем остаток суммы :
		* Первый аргумент - может быть можно дать еще одну такую монету ?
		* Второй аргумент - общая сумма убавилась на одну монету cost[maxcoin].
		*/
		    change( maxcoin, sum - coins(maxcoin) );
	
		    count(maxcoin) -= 1;   /* ... Теперь попробуем иной вариант ... */
		}
	
		return 0
		
		
	};System.out.println("""change: (maxcoin: Int, sum: Int)Int""")}
	
	
	
	
}
