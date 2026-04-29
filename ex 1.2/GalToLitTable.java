/*
   Упражнение 1.2
   Эта программа отображает таблицу преобразований галлонов в литры.
   Назовите этот файл GalToLitTable.java.
*/
class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0; 
        for (gallons = 1.0; gallons <= 100.0; gallons++) {
            liters = gallons * 3.7854; 
            System.out.println(gallons + " галлонов соответствует " +
                    liters + " литрам.");

            counter++; 
        
            if (counter == 10) {
                System.out.println(); 
                counter = 0; 
            }
        }
    }
}