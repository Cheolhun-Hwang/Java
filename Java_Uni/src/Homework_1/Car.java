package Homework_1;

import java.util.Scanner;

import javax.naming.ldap.ControlFactory;


//클래스 정의를 위한 페이지
public class Car {						//자동차	기능을 정의한 클래스이다.

	public static int CarNum = 0; 	// 자동차 생산수에 따른 변동값을 가진다.
	private int CustID;				//	자동차 고객번호를 정의한 변수이다.
	private String CarSort;		// 자동차 차종을 갖는 변수이다.
	private String CarID;		// 자동차 ID 값은 자동차 종류 + 자동차 번호의 값을 가진다.
	private String CarCol;		//	자동차 색상을 갖는 변수이다.
	Car_Button CarBT;			//	자동차 버튼에 관련된 클래스의 객체를 생성한다.
	Control_Cars CC;				//	자동차 제어에 관련된 클래스의 객체를 생성한다.
	static public Car header = null;		// 관련하여 연결리스트를 통해 관리하기 위해 정적변수를 통해 관리한다.
	public Car linker;						// 연결리스트를 통해 서로를 연결하기 위해 사용된다.
	//	상속을 통해서 변수를 설정할 수 없기 때문에 각 내장 함수에 정의할 변수들을 내장 함수에서 따로 정의.
		
	Car(){
		this.CarSort = "";
		this.CarCol = "";
		this.CarID ="";
		this.CustID = 0;
		CarBT = new Car_Button();
		CC = new Control_Cars();
		linker=null;
	}
	Car(String sort, String col, int num){  //	객체 생성시	초기화의 내용이다.
		this.CarSort = sort;
		this.CarCol = col;
		this.CarID = sort+num;
		this.CustID = num;
		CarBT = new Car_Button();
		CC = new Control_Cars();
		linker=null;
	}
	
	/*이하 내용은 자동차에 사용할 private 변수에 수정 및 값을 얻기 위해 정의한 메소드이다.*/
	public void set_CarSort(String carsort){
		this.CarSort = carsort;
	}
	public void set_CarID(int num){
		this.CarID = this.CarSort + num;
	}
	public void set_Col(String ans){
		this.CarCol = ans;
	}
	
	public String get_Carsort(){
		return this.CarSort;
	}
	public String get_CarID(){
		return this.CarID;
	}
	public String get_Col(){
		return this.CarCol;
	}
	public int get_CustID(){
		return this.CustID;
	}
	
	 //내장 클래스로 자동차 버튼에 관련된 내용을 정의한 클래스이다.
	 class Car_Button{
		 	Light Light_BT;		// LIGHT를 정의한 클래스의 객체 생성
			Window W_BT;			// 창문을 정의한 클래스의 객체 생성
			Door D_BT;			// 문을 정의한 클래스의 객체 생성
			Tmp Tmp_BT ;			//	자동차 내부 에어컨과 히터관련 클래스의 객체 생성
			Energy E_BT ;			//	주유구에 관련된 클래스 객체 생성
			Bluth Blu_BT ;		//	블루투스에 관련된 클래스 객체 생성
			Trunc Trnc_BT ;		//	트렁크버튼에 관련된 클래스 객체 생성
			
		Car_Button(){ 			//	각 클래스 객체의 메모리 할당 초기화
			Light_BT = new Light();
			W_BT = new Window();
			D_BT = new Door();
			Tmp_BT = new Tmp();
			E_BT = new Energy();
			Blu_BT = new Bluth();
			Trnc_BT = new Trunc();
		}
		
		 class Light{								// LIGHT에 관련된 내장클래스 정의
			private boolean In_Light;			// 자동차 내부 LIGHT
			private boolean F_Light;			// 자동차 전방 LIGHT
			private boolean B_Light;			//	자동차 후방 LIGHT
			private boolean Turn_L_Light;		//	자동차 좌회전시 LIGHT
			private boolean Turn_R_Light;		//	자동차 우회전시 LGIHT
			private boolean Stop_Light;		//	자동차 멈춤시	 LIGHT
				
			Light(){								// 클래스 초기화 false 시 꺼짐, true 시 켜짐.
				In_Light = false;
				F_Light = false;
				B_Light = false;
				Turn_L_Light = false;
				Turn_R_Light = false;
				Stop_Light = false;
			}
			
			//pirvate 객체 변수의 값을 설정 및 반환하기 위한 메소드
			
			public boolean get_In_Light(){
				return this.In_Light;
			}
			public boolean get_F_Light(){
				return this.F_Light;
			}
			public boolean get_B_Light(){
				return this.B_Light;
			}
			public boolean get_Turn_L_Light(){
				return this.Turn_L_Light;
			}
			public boolean get_Turn_R_Light(){
				return this.Turn_R_Light;
			}
			public boolean get_Stop_Light(){
				return this.Stop_Light;
			}
			
			public void set_In_Light(boolean ans){
				this.In_Light = ans;
			}
			public void set_F_Light(boolean ans){
				this.F_Light = ans;
			}
			public void set_B_Light(boolean ans){
				this.B_Light = ans;
			}
			public void set_Turn_L_Light(boolean ans){
				this.Turn_L_Light = ans;
			}
			public void set_Turn_R_Light(boolean ans){
				this.Turn_R_Light = ans;
			}
			public void set_Stop_Light(boolean ans){
				this.Stop_Light = ans;
			}
		}
		
	class Window{									// 창문에 관한 내장 클래스
			private boolean F_L_Window;		//	운전석 창문
			private boolean F_R_Window;		//	조수석 창문
			private boolean B_L_Window;		//	운전석 뒷편 창문
			private boolean B_R_Window;		//	조수석 뒷편 창문

			Window(){								//	창문 클래스 초기화.
				F_L_Window = false;
				F_R_Window = false;
				B_L_Window = false;
				B_R_Window = false;
			}
			// 이하 private 객체 변수 값 설정 및 얻기 위한 메소드화
			public boolean get_F_L_Window(){
				return this.F_L_Window;
			}
			public boolean get_F_R_Window(){
				return this.F_R_Window;
			}
			public boolean get_B_L_Window(){
				return this.B_L_Window;
			}
			public boolean get_B_R_Window(){
				return this.B_R_Window;
			}

			public void set_F_L_Window(boolean ans){
				this.F_L_Window = ans;
			}
			public void set_F_R_Window(boolean ans){
				this.F_R_Window = ans;
			}
			public void set_B_L_Window(boolean ans){
				this.B_L_Window = ans;
			}
			public void set_B_R_Window(boolean ans){
				this.B_R_Window = ans;
			}
		}
		
		 class Door{								// 문에 관한 내장클래스 정의.
			private boolean F_L_Door;			// 운전석 문
			private boolean F_R_Door;			//	조수석 문
			private boolean B_L_Door;			//	운전석 뒷편
			private boolean B_R_Door;			//	조수석 뒷편

			Door(){								//	문 클래스 초기화
				F_L_Door = false;
				F_R_Door = false;
				B_L_Door = false;
				B_R_Door = false;
			}
			// 이하 private 객체 변수 값 설정 및 얻기 위한 메소드
			public boolean get_F_L_Door(){
				return this.F_L_Door;
			}
			public boolean get_F_R_Door(){
				return this.F_R_Door;
			}
			public boolean get_B_L_Door(){
				return this.B_L_Door;
			}
			public boolean get_B_R_Door(){
				return this.B_R_Door;
			}

			public void set_F_L_Door(boolean ans){
				this.F_L_Door = ans;
			}
			public void set_F_R_Door(boolean ans){
				this.F_R_Door = ans;
			}
			public void set_B_L_Door(boolean ans){
				this.B_L_Door = ans;
			}
			public void set_B_R_Door(boolean ans){
				this.B_R_Door = ans;
			}
		}
		
		 class Tmp{											//	차량 내부 온도에 관련된 클래스
			private boolean Hit;							//	히터 동작에 관련된 변수
			private boolean Cool;							//	에어컨 동작에 관련된 변수
			private int Now_temp;							//	현재 온도를 저장하기 위한 변수
			private int Want_temp;							//	설정 온도를 저장하기 위한 변수

			Tmp(){												//	차량 내부 온도 관련 클래스 초기화
				Cool = false;
				Hit = false;
				Now_temp = 20;								//	따로 측정하여 값을 초기화하기 어렵기 때문에 초기 설정
				Want_temp = 0;
			}
			//private 값을 설정 및 반환하기 위한 메소드 정의
			public boolean get_Hit_on_off(){
				return this.Hit;
			}
			public int get_Now_temp(){
				return this.Now_temp;
			}
			public int get_Want_temp(){
				return this.Want_temp;
			}
			public boolean get_Cool_on_off(){
				return this.Cool;
			}
			
			public void set_Cool_on_off(boolean ans){
				this.Cool = ans;
			}
			public void set_Hit_on_off(boolean ans){
				this.Hit = ans;
			}
		
			public void set_Now_temp(int ans){
				this.Now_temp = ans;
			}
			public void set_Want_temp(int ans){
				this.Want_temp = ans;
			}

			public void Usint_Hit(){											// 히터 작동에 관련된 메소드
				System.out.println(this.Now_temp +" "+ this.Want_temp);
				if(this.Now_temp >= this.Want_temp){
					System.out.println("----------------------------------------");//설정온도와 비교하여 이하 내용처리
					System.out.println("###***");
					System.out.println("설정하신 온도보다 현재 온도가 더 높습니다.");
					System.out.println("다시 설정하여 주십시오.");
					System.out.println("----------------------------------------");
					return ;
				}else{
					while(this.Now_temp != this.Want_temp){					//	직접 측정 및 시간단위로 변환하지 않고 반복문으로 정의
						this.Now_temp++;
						System.out.println("###**");
						System.out.println("현재 실재 온도가 1도 상승하였습니다.");
						System.out.println("설정온도 : " + this.Want_temp + "   현재 온도 : " + this.Now_temp);
					}
				}
			}
			
			public void Usint_Cool(){											// 에어컨 작동에 관련된 메소드
				System.out.println(this.Now_temp +" "+ this.Want_temp);
				if(this.Now_temp <= this.Want_temp){
					System.out.println("----------------------------------------");	//설정온도와 비교하여 이하 내용처리
					System.out.println("###***");
					System.out.println("설정하신 온도보다 현재 온도가 더 낮습니다.");
					System.out.println("다시 설정하여 주십시오.");
					System.out.println("----------------------------------------");
					return ;
				}else{
					while(this.Now_temp != this.Want_temp){					//	직접 측정 및 시간단위로 변환하지 않고 반복문으로 정의
						this.Now_temp--;
						System.out.println("###**");
						System.out.println("현재 실재 온도가 1도 내려갔습니다.");
						System.out.println("설정온도 : " + this.Want_temp + "   현재 온도 : " + this.Now_temp);
					}
				}
			}
			
		}
						
				class Energy{														// 주유구에 관련된 클래스
					
					final int Full_energy_g = 100;							//	최대 게이지 상수화, 최대 게이지는 바뀌면 안됨.
					
					private boolean Energy_on_off;							//	주유구가 열렸는지 알기 위한 변수
					private double Now_energy_g;								//	현재 연료를 알기 위한 변수
					private double In_energy_g;								//	주유할 양을 알기 위한 변수

					Energy(){														// 클래스 초기화
						Energy_on_off = false;
						Now_energy_g = 50;										//	기본설정은 50/100으로 연료상태 초기화
						In_energy_g = 0;
					}
					// private 값을 설정 및 얻기 위한 메소드 정의
					public boolean get_Energy_on_off(){
						return this.Energy_on_off;
					}
					public double get_Now_energy_g(){
						return this.Now_energy_g;
					}
					public double get_In_energy_g(){
						return this.In_energy_g;
					}
					
					public void set_Energy_on_off(boolean ans){
						this.Energy_on_off = ans;
					}
					public void set_Now_energy_g(double ans){
						this.Now_energy_g = ans;
					}
					
					public void set_In_energy_g(double ans){					//연료를 집어넣기 위해 사용되는 메소드
						this.In_energy_g = ans;
						this.Now_energy_g = this.Now_energy_g + this.In_energy_g;	
						if(this.Now_energy_g >= Full_energy_g){					// 최대게이지를 넘어셔면 다음 과정 실행
							this.Now_energy_g = this.Full_energy_g;				// 현재 연료는 최대게이지값을 갖는다.
							System.out.println("----------------------------------------");
							System.out.println("###***");
							System.out.println("가득찼습니다.\n" + "넘친 연로 : " + (this.Now_energy_g-this.Full_energy_g));
							System.out.println("----------------------------------------");	//넘친 연료에 대한 정보를 보여준다.
						}
					}
				}
				
				class Trunc{													// 트렁크에 관련된 내장 클래스
					
					private boolean trunc_on_off;							// 열렸는지 알기 위한 변수

					Trunc(){													// 클래스 초기화
						trunc_on_off = false;
					}
					//private 값을 설정 및 얻기 위한 메소드 정의
					public boolean get_trunc_on_off(){
						return this.trunc_on_off;
					}
					
					public void set_trunc_on_off(boolean ans){
						this.trunc_on_off = ans;
					}
					
				}


				class Bluth{													//블루투스에 관련된 내장 클래스
					
					private boolean Bluth_on_off;							//블루투스 설정되었는지 알기 위한 변수
					private String Blu_eng;									//	연결된 기기를 알기 위한 변수

					Bluth(){													//클래스 초기화
						Bluth_on_off = false;
						Blu_eng = "No Device.";								//기기가 없을때 나타날 문자열 초기화
					}
					
					public void reset(){									// 연결 종료시 나타날 메시지 초기화
						this.Blu_eng = "No Device.";
					}
					// 이하 private 값 반환 및 설정 메소드
					public boolean get_Bluth_on_off(){
						return this.Bluth_on_off;
					}
					public String get_Blu_eng(){
						return this.Blu_eng;
					}
					
					public void set_Bluth_on_off(boolean ans){
						this.Bluth_on_off = ans;
					}
					public void set_Blu_eng(String eng){
						this.Blu_eng = eng;
					}
					
					public String print_pas_bluth(){							// 따로 얻지 않고 리스트로 미리 만들어 놓음.
						String[] pas_blu = new String[10];
						Scanner sc = new Scanner(System.in);
						for (int i = 0 ; i< pas_blu.length ; i++){
							pas_blu[i] = "";
						}
						
						pas_blu[0] = "아이폰 7";
						pas_blu[1] = "갤럭시 7s";
						pas_blu[2] = "샤오미";
						pas_blu[3] = "노트북";
						
						System.out.println("###### 블루투스 인식 기기 #######");
						for (int i = 0 ; i< pas_blu.length ; i++){
							if(pas_blu[i].equals("")){
								break;
							}
							System.out.println((i+1) + "번 기기 : " + pas_blu[i]);
						}
						System.out.println("----------------------------------------");
						System.out.println("더 이상 찾을 기기가 없습니다.");
						System.out.println("----------------------------------------");
						System.out.println("##");
						System.out.print("연결할 기기(취소 0) : ");				// 연결할 기기시 문자열로 반환한다.
						int punc = sc.nextInt();
						
						return (pas_blu[(punc-1)]);
					}
						
					
				}

					
	}
				
				class Control_Cars{											// 자동차 내부를 제어할 내장클래스
					
					private int past_g;										// 속도 게이지를 나타낼 변수
					private String geer_now;								// 현재 기어를 나타낼 변수
					
					final private int full_past_g = 250;					// 최대 속도를 정의한 변수 상수화
					
					Control_Cars(){											// 클래스 초기화
						past_g=0;
						geer_now = "P";										// 기어 주차모드로 초기화
					}
					//이하 private 설정 및 반환 메소드
					public int get_past_g(){
						return this.past_g;
					}
					public int get_full_past_g(){
						return this.full_past_g;
					}
					public String get_geer_now(){
						return this.geer_now;
					}
					
					public void set_past_g(int num){
						this.past_g = num;
					}
					
					public void set_geer_now(String ans){
						this.geer_now = ans;
					}
					
					public void up_past(int up){								// 가속했을 때 메소드
						if(!(this.geer_now.equals("P")||this.geer_now.equals("N"))){
							System.out.println("######가속");
							this.past_g = this.past_g + up;
							if(this.past_g > this.full_past_g){
								this.past_g = this.full_past_g;
								System.out.println("최고 가능 속도를 넘겼습니다.");
							}
							System.out.println("현재 속도 : " + this.past_g + "  최고 속도" + this.full_past_g);
						}else{
							System.out.println("----------------------------------------");
							System.out.println("현재 가속이 불가능한 기어입니다.");
							System.out.println("현재 기어 상태 : " + this.geer_now);
							System.out.println("----------------------------------------");
						}
					}
					
					public void down_past(int down){							// 감속했을 때 메소드
						if(!(this.geer_now.equals("P")||this.geer_now.equals("N"))){
							System.out.println("######감속");
							this.past_g = this.past_g - down;
							if(this.past_g < 0){
								this.past_g = 0;
								System.out.println("최저 가능 속도를 넘겼습니다.");
							}
							System.out.println("현재 속도 : " + this.past_g + " 최저 속도 : 0");
						}else{
							System.out.println("----------------------------------------");
							System.out.println("현재 감속이 불가능한 기어입니다.");
							System.out.println("현재 기어 상태 : " + this.geer_now);
							System.out.println("----------------------------------------");
						}
					}
					
					public void stop_past(){								// 브레이크시 메소드
						if(!(this.geer_now.equals("P"))){
							this.past_g = 0;
							System.out.println("브레이크!!");
							System.out.println("현재 속도 : " + this.past_g);
						}else{
							System.out.println("----------------------------------------");
							System.out.println("현재 브레이크가 불가능한 기어입니다.");
							System.out.println("현재 기어 상태 : " + this.geer_now);
							System.out.println("----------------------------------------");
						}
					}
					
					public void cnt_geer(String geers){
						if(geers.equals("P") || geers.equals("p")){			// P 주차모드
							this.geer_now = "P";
						}else if(geers.equals("R") || geers.equals("r")){	// R 후진모드
							this.geer_now = "R";
						}else if(geers.equals("N") || geers.equals("n")){	// N 중립모드
							this.geer_now = "N";
						}else {
							this.geer_now = "D";								// D 주행모드
						}
					}
					
					
				}
				
				
		
	
	
}

