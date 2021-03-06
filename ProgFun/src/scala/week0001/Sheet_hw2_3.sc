package week0001

object Sheet_hw2_3 {
	
	var n = 10;                               //> n  : Int = 10
	var count = new Array[Int](n);            //> count  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
	var nvar = 0;                             //> nvar  : Int = 0
	
	var coins = List(2, 1, 3);                //> coins  : List[Int] = List(2, 1, 3)
	
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
		
		
	}                                         //> change: (maxcoin: Int, sum: Int)Int
	
	
	
	
}