package Homework_1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import sun.swing.text.CountingPrintable;


//이용하기 위한 메소드
public class TestCar {
	
	
	public void auto_monitoring(Car temp){			// 전체 고객을 모니터하기 위한 메소드
		
		System.out.println("############## 자동차 자동 모니터링 시스템");
		while(temp != null){		// 더 이상 연결리스트가 존재하지 않을 시에 종료
		
		System.out.println("---->");
			System.out.println("** 고객 " +  (temp.get_CustID()+1));
			System.out.println("차종 : " + temp.get_Carsort() + " 차량 ID : " + temp.get_CarID() +" 차량 색상 : " + temp.get_Col());
			System.out.println("현 기어상태 : "+ temp.CC.get_geer_now()+ " 현 속도 : "+temp.CC.get_past_g() + "/" +temp.CC.get_full_past_g()+" 현 연료 상태 : " + temp.CarBT.E_BT.get_Now_energy_g() + " 현 실내 기온 : " + temp.CarBT.Tmp_BT.get_Now_temp());
			System.out.println("창문 [ 운전수 : " + temp.CarBT.W_BT.get_F_L_Window() + " 조수석 : " + temp.CarBT.W_BT.get_F_R_Window() + " 뒤 왼쪽 : " + temp.CarBT.W_BT.get_B_L_Window() + " 뒤 오른쪽 : " + temp.CarBT.W_BT.get_B_R_Window()+" ]");
			System.out.println("문 [ 운전수 : " + temp.CarBT.D_BT.get_F_L_Door() + " 조수석 : " + temp.CarBT.D_BT.get_F_R_Door() + " 뒤 왼쪽 : " + temp.CarBT.D_BT.get_B_L_Door() + " 뒤 오른쪽 : " + temp.CarBT.D_BT.get_B_R_Door()+" ]");
			System.out.println("Light [ 전방 : " + temp.CarBT.Light_BT.get_F_Light() + " 후방 : " + temp.CarBT.Light_BT.get_B_Light() +  " 내부 : " + temp.CarBT.Light_BT.get_In_Light() + "]");
			System.out.println("Light [ 좌회전 : " + temp.CarBT.Light_BT.get_Turn_L_Light() + " 우회전 : " + temp.CarBT.Light_BT.get_Turn_R_Light() + " 멈춤/경고 : " + temp.CarBT.Light_BT.get_Stop_Light()+ "]");
			System.out.println("트렁크 : " + temp.CarBT.Trnc_BT.get_trunc_on_off() + " 블루투스 : " + temp.CarBT.Blu_BT.get_Bluth_on_off()+ " 주유구 : " + temp.CarBT.E_BT.get_Energy_on_off());
			
			temp = temp.linker;			// 연결리스트를 통해 이동을 통하여 호출
			
		}
	}
	
	public void first_setup(){			// 조건 중 초기 5명에 대한 정의가 되어 있어야 하기 때문에
											//	고객 리스트에 5명의 고객의 차량을 정의할 메소드 이다.
		String[] Sort = {"Fox", "BMW", "Morning", "Cube", "Sonata"};
		String[] Color = {"Black", "Silver", "Red", "Yellow", "White"};
		
		for(int i = 0 ; i< 5 ; i++){
			Car Cust = new Car(Sort[i], Color[i], Car.CarNum++);
			
			if(Car.header == null){
				Car.header = Cust;
			}else{
				Cust.linker = Car.header;
				Car.header = Cust;
			}
			
		}
		
		
	}
	
	public void Create_Cust(){					//차량을 추가할때 사용하는 메소드 정의
		
		Scanner sc = new Scanner(System.in);
		String carsort;
		String col;
		String ans = "n";
	
		while(ans.equals("n") || ans.equals("N")){			// 반복을 통해 지속적으로 추가 가능
		System.out.println("-----*");
		System.out.println("차량 기초 데이터베이스를 구축합니다.");		// 생성시 차종 및 색상을 묻는다.
		System.out.print((Car.CarNum + 1) + "번 고객의 차종 : ");
		carsort = sc.nextLine();
		System.out.print("차량 색상을 적어주세요 : ");
		col = sc.nextLine();
		
		Car Cust = new Car(carsort, col, Car.CarNum++);
		
		if(Car.header == null){
			Car.header = Cust;									//초기에 실행될 조건으로 해더에 만든 객체를 연결한다.
		}else{
			Cust.linker = Car.header;							//기존에 있는 연결리스트에 연결하기 위한 코드
			Car.header = Cust;
		}
		
		System.out.println("====*");
		System.out.println("입력을 끝내시겠습니까? (y/n)");
		ans = sc.nextLine();
		}
	}
	
	public void Con_Car_func(Car temp){			//차량을 드라이브 해보는 메소드이다.
		int car_con;
		int continue_value = 1;
		int func1, func2, func3;
		String funcs1="";
		Scanner sc = new Scanner(System.in);
		System.out.println("##########주행 모드##########");			//고객을 설정한다. 현재 전체 고객의 수를 보여준다.
		System.out.print("주행할 고객 차량을 선택하시오(" + "총주행가능차량 : " + (Car.CarNum) + ") : ");
		car_con = sc.nextInt();
		
		for(int i = 0 ; i<(car_con-1);i++){							//설정 고객을 찾기 위해 그만큼 이동한다.
			temp = temp.linker;
		}
		
		while(continue_value == 1){									//	전체 정보를 보여준다.각 기능에 따른 정보 수정된다.
		System.out.println("#### 차량 전체 모니터링 ####");
		System.out.println("현 기어상태 : "+ temp.CC.get_geer_now()+ " 현 속도 : "+temp.CC.get_past_g() + "/" +temp.CC.get_full_past_g()+" 현 연료 상태 : " + temp.CarBT.E_BT.get_Now_energy_g() + " 현 실내 기온 : " + temp.CarBT.Tmp_BT.get_Now_temp());
		System.out.println("창문 [ 운전수 : " + temp.CarBT.W_BT.get_F_L_Window() + " 조수석 : " + temp.CarBT.W_BT.get_F_R_Window() + " 뒤 왼쪽 : " + temp.CarBT.W_BT.get_B_L_Window() + " 뒤 오른쪽 : " + temp.CarBT.W_BT.get_B_R_Window()+" ]");
		System.out.println("문 [ 운전수 : " + temp.CarBT.D_BT.get_F_L_Door() + " 조수석 : " + temp.CarBT.D_BT.get_F_R_Door() + " 뒤 왼쪽 : " + temp.CarBT.D_BT.get_B_L_Door() + " 뒤 오른쪽 : " + temp.CarBT.D_BT.get_B_R_Door()+" ]");
		System.out.println("Light [ 전방 : " + temp.CarBT.Light_BT.get_F_Light() + " 후방 : " + temp.CarBT.Light_BT.get_B_Light() +  " 내부 : " + temp.CarBT.Light_BT.get_In_Light() + "]");
		System.out.println("Light [ 좌회전 : " + temp.CarBT.Light_BT.get_Turn_L_Light() + " 우회전 : " + temp.CarBT.Light_BT.get_Turn_R_Light() + " 멈춤/경고 : " + temp.CarBT.Light_BT.get_Stop_Light()+ "]");
		System.out.println("트렁크 : " + temp.CarBT.Trnc_BT.get_trunc_on_off() +  " 블루투스 : " + temp.CarBT.Blu_BT.get_Bluth_on_off()+ " 주유구 : " + temp.CarBT.E_BT.get_Energy_on_off());
		System.out.println("-------*");
		System.out.println("이용 기능 선택 : ");
		System.out.println("1. 핸들 조작");
		System.out.println("2. 기어 조작");
		System.out.println("3. 속도 조절");
		System.out.println("4. 온도 조절");
		System.out.println("5. LIGHT 조절");
		System.out.println("6. 블루투스 조절");
		System.out.println("7. 트렁크 조절");
		System.out.println("8. 주유구 조절");
		System.out.println("9. 문/창문 조절");
		System.out.println("10. 종 료");
		System.out.print("-> ");
		func1 = sc.nextInt();
		
		switch(func1){
		case 1:
			if(temp.CarBT.E_BT.get_Now_energy_g() != 0){	//핸들이동간에 작동한다. // 연료가 없다면 움직이지 않는다.
				System.out.println("##");
				System.out.println("1. 좌");
				System.out.println("2. 우");
				System.out.println("3. 직진");
				System.out.println("4. 크락션");
				System.out.print("--> ");
				func2 = sc.nextInt();
				
				if(func2 == 1){
					temp.CarBT.Light_BT.set_Turn_L_Light(true);		//좌회전시 좌회전 Light 작동
				}else if(func2 == 2 ){
					temp.CarBT.Light_BT.set_Turn_R_Light(true);		//좌회전시 우회전 Light 작동
				}else if(func2 == 3){
					temp.CarBT.Light_BT.set_Turn_L_Light(false);	// 직진시 모든 회전 LIGHT 꺼진다.
					temp.CarBT.Light_BT.set_Turn_R_Light(false);
				}else if(func2 == 4){									// 크락션은 출력으로만 대체
					System.out.println("빵!");
				}else{
					System.out.println("잘못된 선택을 하셨습니다.");
				}
			}else{
				System.out.println("차량 연료가 없습니다.");				
			}
			break;
		case 2 :
			System.out.println("##");									// 기어를 수정하기 위한 내용이다.
			System.out.println("1. P");
			System.out.println("2. R");
			System.out.println("3. N");
			System.out.println("4. D");
			System.out.print("--> ");
			func2 = sc.nextInt();
			switch(func2){
			case 1:
				funcs1 = "P";
				break;
			case 2:
				funcs1= "R";
				break;
			case 3:
				funcs1 = "N";
				break;
			case 4 :
				funcs1 = "D";
			default :
				System.out.println("잘못된 선택입니다.");
			}
			temp.CC.cnt_geer(funcs1);
			break;
		case 3:												//가속 감속 브레이크를 컨트롤하기 위한 내용이다.
			if(temp.CarBT.D_BT.get_B_L_Door() || temp.CarBT.D_BT.get_B_R_Door()||temp.CarBT.D_BT.get_F_L_Door()||temp.CarBT.D_BT.get_F_R_Door()){
				System.out.println("----------------------------------------");
				System.out.println("#Warning!!");
				System.out.println("문이 열려있습니다.");
				System.out.println("----------------------------------------");
			}else if(temp.CarBT.Trnc_BT.get_trunc_on_off()){
				System.out.println("----------------------------------------");
				System.out.println("#Warning");
				System.out.println("트렁크가 열려있습니다.");
				System.out.println("----------------------------------------");
			}else if(temp.CarBT.E_BT.get_Energy_on_off()){
				System.out.println("----------------------------------------");
				System.out.println("#Warning");
				System.out.println("주유구가 열려있습니다.");
				System.out.println("----------------------------------------");
			}																				// 각조건에 경고문을 출력한다.
			System.out.println("##");
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.println("3. 브레이크");
			System.out.print("-->");
			func2 = sc.nextInt();
			
			if(func2 == 1){
				System.out.print("가속 정도(최대 : " + temp.CC.get_full_past_g() + ") : " );	//가속 감속은 각 입력을 받는다.
				func3 = sc.nextInt();																// 시간단위로 제어하지 않음.
				temp.CC.up_past(func3);
				double en_temp = temp.CarBT.E_BT.get_Now_energy_g();
				temp.CarBT.E_BT.set_Now_energy_g((en_temp - 1));							// 한번 작동시 1L가 사용된다. 가속시만 사용된다.  
			}else if(func2 == 2){
				System.out.print("감속 정도(최저 : 0) : " );
				func3 = sc.nextInt();
				temp.CC.down_past(func3);
			}else if(func2 == 3){
				temp.CC.stop_past();
				temp.CarBT.Light_BT.set_Stop_Light(true);
				System.out.println("경고 Light " + temp.CarBT.Light_BT.get_Stop_Light() + "!");
				temp.CarBT.Light_BT.set_Stop_Light(false);
				System.out.println("경고 Light " + temp.CarBT.Light_BT.get_Stop_Light() + "!");
			}else{
				System.out.println("잘못된 선택입니다.");
			}
			break;
		case 4:		//온도 조절에 대한 내용이다.
			System.out.println("##");
			System.out.println("1. 에어컨");
			System.out.println("2. 히터");
			System.out.print("-->");
			func2 = sc.nextInt();
			if(func2 == 1){
				if(!(temp.CarBT.Tmp_BT.get_Cool_on_off())){
				System.out.print("에어컨 설정 온도(현재 온도 : "+ temp.CarBT.Tmp_BT.get_Now_temp() + ") : " );
				func3 = sc.nextInt();
				temp.CarBT.Tmp_BT.set_Cool_on_off(true);
				temp.CarBT.Tmp_BT.set_Want_temp(func3);
				temp.CarBT.Tmp_BT.Usint_Cool();
				}else{
					temp.CarBT.Tmp_BT.set_Cool_on_off(false);
				}
			}else if(func2 == 2){
				if(!(temp.CarBT.Tmp_BT.get_Hit_on_off())){
				System.out.println("히터 설정 온도(현재 온도 : "+ temp.CarBT.Tmp_BT.get_Now_temp() + ") : ");
				func3 = sc.nextInt();
				temp.CarBT.Tmp_BT.set_Hit_on_off(true);
				temp.CarBT.Tmp_BT.set_Want_temp(func3);
				temp.CarBT.Tmp_BT.Usint_Hit();
				}else{
					temp.CarBT.Tmp_BT.set_Hit_on_off(false);
				}
			}else{
				System.out.println("잘못된 선택입니다.");
			}
			break;
		case 5:							//Light를 제어하기 위한 내용이다.
			System.out.println("##");
			System.out.println("1. 내부");
			System.out.println("2. 전방");
			System.out.println("3. 후방");
			System.out.println("4. 경고/멈춤");
			System.out.print("--> ");
			func2 = sc.nextInt();
			
			if(func2 == 1){				// 만약 LIGHT가 켜져 있다면 꺼지게 만들고, 꺼졌다면 켜지게 만든다.
				if(!(temp.CarBT.Light_BT.get_In_Light())){
				temp.CarBT.Light_BT.set_In_Light(true);
				}else{
					temp.CarBT.Light_BT.set_In_Light(false);
				}
			}else if(func2 == 2){
				if(!(temp.CarBT.Light_BT.get_F_Light())){
				temp.CarBT.Light_BT.set_F_Light(true);
				}else{
					temp.CarBT.Light_BT.set_In_Light(false);
				}
			}else if(func2 == 3){
				if(!(temp.CarBT.Light_BT.get_B_Light())){
				temp.CarBT.Light_BT.set_B_Light(true);
				}else{
					temp.CarBT.Light_BT.set_B_Light(false);
				}
			}else if(func2 == 4){
				if(!(temp.CarBT.Light_BT.get_Stop_Light())){
				temp.CarBT.Light_BT.set_Stop_Light(true);
				}else{
					temp.CarBT.Light_BT.set_Stop_Light(false);
				}
			}else{
				System.out.println("잘못된 선택입니다.");
			}
			break;
		case 6:		//블루투스에 관련된 내용이다.
			System.out.println("##");	//현재 상태를 출력해준다.
			System.out.println("블루투스 상태 : " + temp.CarBT.Blu_BT.get_Bluth_on_off() + " 블루투스연결 장치 리스트 : " + temp.CarBT.Blu_BT.get_Blu_eng()+"\n--------------");
			if(!(temp.CarBT.Blu_BT.get_Bluth_on_off())){
				temp.CarBT.Blu_BT.set_Bluth_on_off(true);
				String ans = temp.CarBT.Blu_BT.print_pas_bluth();
				temp.CarBT.Blu_BT.set_Blu_eng(ans);
			}else{
				temp.CarBT.Blu_BT.set_Bluth_on_off(false);
				temp.CarBT.Blu_BT.reset();
			}
			break;
		case 7:		//트렁크 관련 내용이다.
			System.out.println("##");
			if(!(temp.CarBT.Trnc_BT.get_trunc_on_off())){
				temp.CarBT.Trnc_BT.set_trunc_on_off(true);
			}else{
				temp.CarBT.Trnc_BT.set_trunc_on_off(false);
			}
			break; 
		case 8:		//	주유구에 관한 내용이다. 열었다면 충전양이 있기 때문에 적으면 추가된다.
			System.out.println("##");
			if(!(temp.CarBT.E_BT.get_Energy_on_off())){
				temp.CarBT.E_BT.set_Energy_on_off(true);
				System.out.print("연료 충전 양 : " );
				func2 = sc.nextInt();
				temp.CarBT.E_BT.set_In_energy_g(func2);
			}else{
				temp.CarBT.E_BT.set_Energy_on_off(false);
			}
			break;
		case 9: //문과 창문을 열거나 닫는 내용이다.
			System.out.println("##");
			System.out.println("1. 문");
			System.out.println("2. 창문");
			System.out.print("--> ");
			func2 = sc.nextInt();
			
			if(func2 == 1){
				System.out.println("--*");
				System.out.println("1. 운전석");
				System.out.println("2. 조수석");
				System.out.println("3. 운전석 뒷편");
				System.out.println("4. 조수석 뒷편");
				System.out.print("--> ");
				func3 = sc.nextInt();
				switch(func3){
				case 1 :
					if(!(temp.CarBT.D_BT.get_F_L_Door())){
						temp.CarBT.D_BT.set_F_L_Door(true);
					}else{
						temp.CarBT.D_BT.set_F_L_Door(false);
					}
					break;
				case 2 :
					if(!(temp.CarBT.D_BT.get_F_R_Door())){
						temp.CarBT.D_BT.set_F_R_Door(true);
					}else{
						temp.CarBT.D_BT.set_F_R_Door(false);
					}
					break;
				case 3 :
					if(!(temp.CarBT.D_BT.get_B_L_Door())){
						temp.CarBT.D_BT.set_B_L_Door(true);
					}else{
						temp.CarBT.D_BT.set_B_L_Door(false);
					}
					break;
				case 4 :
					if(!(temp.CarBT.D_BT.get_B_R_Door())){
						temp.CarBT.D_BT.set_B_R_Door(true);
					}else{
						temp.CarBT.D_BT.set_B_R_Door(false);
					}
					break;
				default :
					System.out.println("잘못된 선택입니다.");
				}
			}else if(func2 == 2){
				System.out.println("--*");
				System.out.println("1. 운전석");
				System.out.println("2. 조수석");
				System.out.println("3. 운전석 뒷편");
				System.out.println("4. 조수석 뒷편");
				System.out.print("--> ");
				func3 = sc.nextInt();
				switch(func3){
				case 1 :
					if(!(temp.CarBT.W_BT.get_F_L_Window())){
						temp.CarBT.W_BT.set_F_L_Window(true);
					}else{
						temp.CarBT.W_BT.set_F_L_Window(false);
					}
					break;
				case 2 :
					if(!(temp.CarBT.W_BT.get_F_R_Window())){
						temp.CarBT.W_BT.set_F_R_Window(true);
					}else{
						temp.CarBT.W_BT.set_F_R_Window(false);
					}
					break;
				case 3 :
					if(!(temp.CarBT.W_BT.get_B_L_Window())){
						temp.CarBT.W_BT.set_B_L_Window(true);
					}else{
						temp.CarBT.W_BT.set_B_L_Window(false);
					}
					break;
				case 4 :
					if(!(temp.CarBT.W_BT.get_B_R_Window())){
						temp.CarBT.W_BT.set_B_R_Window(true);
					}else{
						temp.CarBT.W_BT.set_B_R_Window(false);
					}
					break;
				default :
					System.out.println("잘못된 선택입니다.");
				}
			}else{
				System.out.println("잘못된 입력입니다.");
			}
			break;
		case 10: //종료에 대한 내용이다.
			continue_value = 0 ;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		}
		
		return ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCar tc = new TestCar();	//현 메소드를 생성하여 초기화한다.
		int func;							//	기능을 입력받을 변수이다.
		Scanner sc = new Scanner(System.in);
		
		tc.first_setup();				// 초기 고객 5명을 초기화 받을 내용이다.
		
		
		while(true){
			System.out.println("########## 자동차 고객 관리 ver.Beta ###########");
			System.out.println("1. 고객 추가");
			System.out.println("2. 전체 고객 차량 모니터링 ");
			System.out.println("3. 특정 고객 차량 드라이브 ");
			System.out.println("4. 종 료");
			System.out.print("--> ");
			func = sc.nextInt();
			
			if(func == 1){
				tc.Create_Cust();
			}else if(func == 2){
				tc.auto_monitoring(Car.header);
			}else if(func == 3){
				tc.Con_Car_func(Car.header);
			}else if(func == 4){
				break;
			}else{
				System.out.println("잘못된 선택입니다.");
			}
			System.out.println("\n\n");
		}
		
		
		
	}
	
	

}
