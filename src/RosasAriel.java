
public class RosasAriel {


    public static void raSN1(int tamaño){
        int arValAnt = 0;
        int arValAct = 1;
        int arResult = 0;
        System.out.print("SN1: ");
        for(int i = 0;i<tamaño;i++){
            System.out.print(arResult+" "); 
            arResult = arValAct +   arValAnt; 
            arValAnt = arValAct;
            arValAct = arResult;
            
        }

    }
    public static void raSN2(int tamaño){
        System.out.print("SN2: ");
        int arResltUno = 0;
        int arResltDos = 1;
        for(int i = 0;i<tamaño;i++){
            System.out.print(arResltUno+" " + arResltDos +" "); 
            arResltDos = arResltDos+2;            
        }

    }
    public static void raSN3(int tamaño){
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for(int i =0;i<tamaño;i++){
            if((arDem % 2)!=0){
                System.out.print(arNum + "/" + arDem +" ");
                if(arNum==0){
                    arNum+=1;
                }else{
                arNum = arValAct +   arValAnt; 
                arValAnt = arValAct;
                arValAct = arNum;
                }
            }
            arDem++;
        }

    }
    public static void raSN4(int tamaño){
        System.out.print("SN4: ");
        int arNum = 0;
        int arDem = 0;
        int arValAnt = 0;
        int arValAct = 1;
        System.out.print("SN3: ");
        for(int i =0;i<tamaño;i++){
            if((arDem % 2)==0){
                System.out.print(arNum + "/" + arDem +" ");
                if(arNum==0){
                    arNum+=1;
                }else{
                arNum = arValAct +   arValAnt; 
                arValAnt = arValAct;
                arValAct = arNum;
                }
            }
            arDem++;
        }

    }
    public static void raSN5(int tamaño){
        int arVal = 1;
        System.out.print("SN5: ");
        for(int i =0;i<tamaño;i++){
            if((arVal%2!=0)&&(arVal%3!=0)){
                System.out.print(arVal + " ");
            }
            arVal++;
        }
    }
    public static void raSN6(int tamaño){
        System.out.print("SN6: ");
        for(int i =0;i<tamaño;i++){
            
        }
    }
    public static void raSN7(int tamaño){
        
    }
    public static void raSN8(int tamaño){
        
    }
    public static void raSN9(int tamaño){
        
    }

}


