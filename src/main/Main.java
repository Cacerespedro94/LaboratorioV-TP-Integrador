package main;



import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Entidad.Cuentas;
import Entidad.Movimientos;
import Entidad.TipoCuenta;
import Entidad.Transferencias;
import Entidad.Usuario;
public class Main 
{
    public static void main( String[] args )
    {
	
    	SessionFactory sessionFactory;
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
 
    	session.beginTransaction();
 
    	TipoCuenta tipoCuenta1 = new TipoCuenta("Dolares");
    	TipoCuenta tipoCuenta2 = new TipoCuenta("Pesos Argentinos");
    	TipoCuenta tipoCuenta3 = new TipoCuenta("Pesos Paraguayo");
    	TipoCuenta tipoCuenta4 = new TipoCuenta("Pesos Boliviano");
    	TipoCuenta tipoCuenta5 = new TipoCuenta("Patacones");
    	TipoCuenta tipoCuenta6 = new TipoCuenta("Euros");
    	TipoCuenta tipoCuenta7 = new TipoCuenta("Yenes");
    	TipoCuenta tipoCuenta8 = new TipoCuenta("Dolar Australiano");
    	TipoCuenta tipoCuenta9 = new TipoCuenta("Libra");
    	TipoCuenta tipoCuenta10 = new TipoCuenta("Yuan");
    	session.save(tipoCuenta1);
    	session.save(tipoCuenta2);
    	session.save(tipoCuenta3);
    	session.save(tipoCuenta4);
    	session.save(tipoCuenta5);
    	session.save(tipoCuenta6);
    	session.save(tipoCuenta7);
    	session.save(tipoCuenta8);
    	session.save(tipoCuenta9);
    	session.save(tipoCuenta10);
    	
    	
    	Usuario usuario1 = new Usuario("Robert","123456",1,3515615,203515615,"M","Argentina","19-08-1994","Lobos 321","Tigre","Buenos Aires","robert@gmail.com",4511223,"Roberto","Morales",1);
    	Usuario usuario2 = new Usuario("Cristian","34567892",2,56473829,203513243,"M","Argentina","19-08-1994","Perro 321","Tigre","Buenos Aires","cristian@gmail.com",4556223,"Cristian","Flores",1);
    	Usuario usuario3 = new Usuario("Pedro","3457898892",2,56773867,2035567243,"M","Argentina","15-06-1998","Perro 321","Tigre","Buenos Aires","Pedro@gmail.com",5676223,"Pedro","Flores",1);
    	Usuario usuario4 = new Usuario("Marcos","3457879892",2,56473829,206713243,"M","Argentina","06-07-1994","Perro 321","Tigre","Buenos Aires","Marcos@gmail.com",4345223,"Marcos","Rodriguez",1);
    	Usuario usuario5 = new Usuario("Mateo","345787782",2,59573829,208613243,"M","Argentina","09-09-1994","gatito321","Tigre","Buenos Aires","Mateo@gmail.com",4345223,"Mateo","Rodriguez",1);
    	Usuario usuario6 = new Usuario("Lucas","34456782",2,58973829,208613243,"M","Argentina","04-04-1996","raton 321","Tigre","Buenos Aires","Lucas@gmail.com",4345223,"Lucas","Martinez",1);
    	Usuario usuario7 = new Usuario("Daniela","345787782",2,59573829,208613243,"F","Argentina","01-01-1991","gatito321","Martinez","Buenos Aires","Daniela@gmail.com",4345223,"Daniela","Martinez",1);
    	Usuario usuario8 = new Usuario("Carolina","346787782",2,7859579,29613243,"F","Argentina","02-02-1992","toro321","Martinez","Buenos Aires","Carolina@gmail.com",5435223,"Carolina","Sanchez",1);
    	Usuario usuario9 = new Usuario("Marta","789787782",2,9959579,2009613243,"F","Argentina","02-02-1992","torito321","Sanchez","Buenos Aires","Marta@gmail.com",5435223,"Marta","Sanchez",1);
    	Usuario usuario10 = new Usuario("Mirta","789787782",2,9573829,2009613243,"F","Argentina","02-02-1992","rana321","Campos","Buenos Aires"," Mirta@gmail.com",5435223," Mirta","Campos",1);
    	session.save(usuario1);
    	session.save(usuario2);
    	session.save(usuario3);
    	session.save(usuario4);
    	session.save(usuario5);
    	session.save(usuario6);
    	session.save(usuario7);
    	session.save(usuario8);
    	session.save(usuario9);
    	session.save(usuario10);
    	
    	    	
    	Cuentas cuenta1 = new Cuentas(1,"Robert","23213348","19-08-2017",1,10000,1);
        Cuentas cuenta2 = new Cuentas(2," Cristian","33213248","19-08-2017",1,10000,2);
        Cuentas cuenta3 = new Cuentas(3," Pedro","53213248","19-08-2017",1,10000,3);
        Cuentas cuenta4 = new Cuentas(4," Marcos","53263248","19-08-2017",1,10000,4);
        Cuentas cuenta5 = new Cuentas(5," Mateo","25213249","19-08-2017",1,10000,5);
        Cuentas cuenta6 = new Cuentas(6," Lucas","63213248","19-08-2017",1,10000,6);
        Cuentas cuenta7 = new Cuentas(7," Daniela","73214248","19-08-2017",1,10000,7);
        Cuentas cuenta8 = new Cuentas(8," Carolina","23218248","19-08-2017",1,10000,8);
        Cuentas cuenta9 = new Cuentas(9," Marta","83213248","19-08-2017",1,10000,9);
        Cuentas cuenta10 = new Cuentas(10," Mirta","18213248","19-08-2017",1,10000,10);
    	
    	session.save(cuenta1);
    	session.save(cuenta2);
    	session.save(cuenta3);
    	session.save(cuenta4);
    	session.save(cuenta5);
    	session.save(cuenta6);
    	session.save(cuenta7);
    	session.save(cuenta8);
    	session.save(cuenta9);
    	session.save(cuenta10);
    	
     	Transferencias trans1 = new Transferencias("23213348","33213248", 10500);
    	Transferencias trans2 = new Transferencias("33213248","23213348", 500);
    	Transferencias trans3 = new Transferencias("53263248","33213248",1000);
    	Transferencias trans4 = new Transferencias("23213348","23218248",1000);
    	Transferencias trans5 = new Transferencias("18213248","33213248",3000);
    	Transferencias trans6 = new Transferencias("23218248","33213248",4000);
    	Transferencias trans7 = new Transferencias("18213248","18213248",600);
    	Transferencias trans8 = new Transferencias("63213248","73214248",800);
    	Transferencias trans9 = new Transferencias("23213348","33213248",8000);
    	Transferencias trans10 = new Transferencias("83213248","33213248",3000);
    	
    	session.save(trans1);
    	session.save(trans2);
    	session.save(trans3);
    	session.save(trans4);
    	session.save(trans5);
    	session.save(trans6);
    	session.save(trans7);
    	session.save(trans8);
    	session.save(trans9);
    	session.save(trans10);
    	
    	
    	Movimientos movimiento1 = new Movimientos(1,"20-06-2021","Transferencia a terceros",1000,1,"33213248");
    	Movimientos movimiento2 = new Movimientos(2,"20-06-2021","Transferencia cuenta propia",2000,1,"23213348");
    	Movimientos movimiento3 = new Movimientos(3,"20-06-2021","Transferencia a terceros",500,1,"33213248");
    	Movimientos movimiento4 = new Movimientos(4,"20-06-2021","Transferencia cuenta propia",6000,1,"53263248");
    	Movimientos movimiento5 = new Movimientos(5,"20-06-2021","Transferencia a terceros",750,1,"83213248");
    	Movimientos movimiento6 = new Movimientos(6,"20-06-2021","Transferencia cuenta propia",900,1,"33213248");
    	Movimientos movimiento7 = new Movimientos(7,"20-06-2021","Transferencia a terceros",3000,1,"33213248");
    	Movimientos movimiento8 = new Movimientos(8,"20-06-2021","Transferencia cuenta propia",3500,1,"83213248");
    	Movimientos movimiento9 = new Movimientos(9,"20-06-2021","Transferencia a terceros",4000,1,"18213248");
    	Movimientos movimiento10 = new Movimientos(10,"20-06-2021","Transferencia cuenta propia",600,1,"53263248");
    	
    	session.save(movimiento1);
    	session.save(movimiento2);
    	session.save(movimiento3);
    	session.save(movimiento4);
    	session.save(movimiento5);
    	session.save(movimiento6);
    	session.save(movimiento7);
    	session.save(movimiento8);
    	session.save(movimiento9);
    	session.save(movimiento10);
    	
    	
  	
    	
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
    }
}
