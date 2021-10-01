import java.util.Calendar;
public class Main {
    public static void main(String[] args) {

        /*CPU cpu= new CPU(25,"Core i9 10900K","F3H85","Intel","EEUU", Calendar.getInstance().getTime());
        Monitores monitores= new Monitores(1080,"Televisor Smart","KATYT78","SAMNSUNG","China",Calendar.getInstance().getTime());
        HDD discos = new HDD(2480,"Toshiba","TYR85P","Barracuda","EEUU",Calendar.getInstance().getTime());


        Alquiler alquiler= new Alquiler("KLP77",168.6,monitores,discos);


        Proveedores proveedores= new Proveedores("GT895","La Paz el Alto",680,cpu,Calendar.getInstance().getTime());
        Proveedores monitor= new Proveedores("GT895","Tarija",1280,monitores,Calendar.getInstance().getTime());


        Empresa_Fabricante fabrica=new Empresa_Fabricante("Tecnoligi","Santa Cruz",130,360.6,cpu);

        System.out.println(proveedores );
        System.out.println(monitor);
        System.out.println("______________________________________________________");
        System.out.println(monitores);
        System.out.println( cpu + "" + "Memoria Principal"+ cpu.getMemoria_principal());
        System.out.println("______________________________________________________");
        System.out.println(alquiler);
        System.out.println("______________________________________________________");
        System.out.println(fabrica);*/

        //polimorfismo
        Productos productos= new Productos("mouse","G120","Asus","EEUU",Calendar.getInstance().getTime());
        Productos lj50= new Impresoras(25,"Impresora","lj50","Canon 750","Chile",Calendar.getInstance().getTime());
        System.out.println(lj50);
        Productos s200= new Monitores(1080,"Monitor TV","s200","LG","Rusia",Calendar.getInstance().getTime());
        System.out.println(s200);
        Productos m500 =new HDD(1024,"Disco Duro","m500","Toshiba","Japon",Calendar.getInstance().getTime());
        System.out.println(m500);

        System.out.println("_______________________________________________________");
        Impresoras impresoras= (Impresoras) lj50;
        System.out.println(impresoras);
        Monitores monitor= (Monitores)s200;
        System.out.println(monitor);
        HDD discoDuro= (HDD)m500;
        System.out.println(discoDuro);

        System.out.println("_______________________________________________________");
        Productos[] productos1= new Productos[3];
        productos1[0]= impresoras;
        productos1[1]=monitor;
        productos1[2]=discoDuro;

        for (int i = 0; i < productos1.length ; i++) {
            System.out.println(productos1[i]);
        }
    }

}
