#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define clear() printf("\033[H\033[J") //화면 clear

typedef struct Ava{
    int hp_g;
    int st_g;
    int sleep_g;
    int clean_g;
}avata;

typedef struct eat{
    int apple;
    int rice;
    int fish;
    int meet;
}Eat;

typedef struct exercise{
    int easy;
    int normal;
    int hard;
    int extream;
    int hell;
}Exer;

void malloc_Ava(avata *av){
    //av = ((avata*)malloc(sizeof(avata)));
    //person* pMan = new person Man;또는person Man;person *pMan = &Man;
    avata *av2 = (avata *)av; //구조체 초기화방법
    av2->hp_g = 100;
    av2->st_g = 100;
    av2->sleep_g = 100;
    av2->clean_g = 100;

}

void malloc_eat(Eat *av){
    //av = ((avata*)malloc(sizeof(avata)));
    //person* pMan = new person Man;또는person Man;person *pMan = &Man;
    Eat *av2 = (Eat *)av; //구조체 초기화방법
    av2->apple = 0;
    av2->rice = 0;
    av2->fish = 0;
    av2->fish = 0;
}

void malloc_exercise(Exer *av){
    //av = ((avata*)malloc(sizeof(avata)));
    //person* pMan = new person Man;또는person Man;person *pMan = &Man;
    Exer *av2 = (Exer *)av; //구조체 초기화방법
    av2->easy = 0;
    av2->normal = 0;
    av2->hard = 0;
    av2->extream = 0;
    av2->hell = 0;

}

void print_gauge(avata *av){
    clear();
    printf("Total Gauge\n");
    printf("================================\n");
    printf("Hp(생명력) : %d\n", av->hp_g);
    printf("St(스테미너) : %d\n", av->st_g);
    printf("Sleep(수면) : %d\n", av->sleep_g);
    printf("Clean(청결도) : %d\n", av->clean_g);
}

int check_event(int *ev, int event_num){
    int i;
    for(i = 0;i<3;i++){
        if((ev+i) == event_num){
            return 1;
        }
    }
    return 0;
}

//쿨타임
void eat_cooltime(Eat *eating){
        eating->apple -= 5;
        if(eating->apple < 0){
            eating->apple == 0;}
        eating->rice -= 5;
        if(eating->rice < 0){
            eating->rice == 0;}
        eating->fish -= 5;
        if(eating->fish < 0){
            eating->fish == 0;}
        eating->meet -= 5;
        if(eating->meet < 0){
            eating->meet == 0;}
}

void exer_cooltime(Exer *exer){
	    exer->easy -= 5;
        if(exer->easy < 0){
            exer->easy == 0;}
        exer->normal -= 5;
        if(exer->normal < 0){
            exer->normal == 0;}
        exer->hard -= 5;
        if(exer->hard < 0){
            exer->hard == 0;}
        exer->extream -= 5;
        if(exer->extream < 0){
            exer->extream == 0;}
        exer->hell -= 5;
        if(exer->hell < 0){
            exer->hell == 0;}
}

//이벤트
void event_one_exer(avata *av, Exer *exer){
    print_gauge(av);
    int ans;
    printf("!!다마고치가 운동하고 싶어해요!!\n");

    if(av->st_g == 0){
        printf("그런데 스테미너가 없어요!\n먼저 스테미너 회복을 해야되요.\n");
        return;
    }
    printf("1.쉬운 운동(쿨타임 20sec / 남은쿨타임 %d) -> hp +10 st -5 sleep -5 clean -1/n", exer->easy);
    printf("2.보통 운동(쿨타임 40sec / 남은쿨타임 %d) -> hp +20 st -10 sleep -10 clean -3/n", exer->normal);
    printf("3.어려운 운동(쿨타임 60sec / 남은쿨타임 %d) -> hp +30 st -15 sleep -15 clean -5/n", exer->hard);
    printf("4.극심한 운동(쿨타임 90sec / 남은쿨타임 %d)/n -> hp +40 st -20 sleep -20 clean -7\n", exer->extream);
    printf("5.지옥 운동(쿨타임 120sec / 남은쿨타임 %d)/n -> hp +50 st -25 sleep -25 clean -9\n", exer->hell);

    while(1){
    printf("->");
    scanf("%d", &ans);

    if(ans == 1 && exer->easy == 0){
        av->hp_g += 10; st_g-=5; sleep_g-=5; clean_g-=1;
        exer->easy+=20;
        break;
    }else if(ans ==2 && exer->normal == 0){
        av->hp_g +=20 ; st_g-=10; sleep_g-=10; clean_g-=3;
        exer->easy+=40;
        break;
    }else if(ans ==3 && exer->hard == 0){
        av->hp_g += 30; st_g-=15; sleep_g-=15; clean_g-=5;
        exer->easy+=60;
        break;
    }else if(ans ==4 && exer->extream == 0){
        av->hp_g += 40; st_g-=20; sleep_g-=20; clean_g-=7;
        exer->easy+=90;
        break;
    }else if(ans ==5 && exer->hell == 0){
        av->hp_g += 50; st_g-=25; sleep_g-=25; clean_g-=9;
        exer->easy+=120;
        break;
    }else(
        printf("쿨타임 또는 잘못된 입력으로 인해 불가능합니다.\n");
    )
    }
}

void event_two_eat(avata *av, Eat *eat){
    print_gauge(av);
    int ans;
    printf("!!다마고치가 밥을 먹고 싶어해요!!\n");

    printf("1.사과 (쿨타임 10sec / 남은쿨타임 %d) -> st +20 /n", eat->apple);
    printf("2.밥   (쿨타임 30sec / 남은쿨타임 %d) -> st +30 /n", eat->rice);
    printf("3.생선 (쿨타임 50sec / 남은쿨타임 %d) -> st +40 /n", eat->fish);
    printf("4.고기 (쿨타임 70sec / 남은쿨타임 %d)/n -> st +50 \n", eat->meet);

    while(1){
    printf("->");
    scanf("%d", &ans);

    if(ans == 1 && eat->apple == 0){
        av->st_g += 20;
        eat->apple+=10;
        break;
    }else if(ans ==2 && eat->rice == 0){
        av->st_g +=30 ;
        exer->rice+=30;
        break;
    }else if(ans ==3 && eat->fish == 0){
        av->st_g += 40;
        exer->fish+=60;
        break;
    }else if(ans ==4 && eat->meet == 0){
        av->st_g += 50;
        exer->meet+=90;
        break;
    }else(
        printf("쿨타임 또는 잘못된 입력으로 인해 불가능합니다.\n");
    )
    }
}

void event_three_wash(avata *av){
    print_gauge(av);
    int ans;
    printf("!!다마고치가 씻고 싶어해요!!\n");

    printf("1.씻기      (쿨타임 0sec) -> st -20 clean +20 /n");
    printf("2.씻지않기   (쿨타임 0sec) -> st -0 clean +0 /n");

    while(1){
    printf("->");
    scanf("%d", &ans);

    if(ans == 1){
        av->st_g -= 20; av->clean_g+=20;
        break;
    }else if(ans ==2 ){
        break;
    }else(
        printf("쿨타임 또는 잘못된 입력으로 인해 불가능합니다.\n");
    )
    }
}

void event_for_sleep(avata *av){
    print_gauge(av);
    int ans;
    printf("!!다마고치가 자고 싶어해요!!\n");

    printf("1.잠에 든다.       (쿨타임 0sec) -> st -15 sleep +30 /n");
    printf("2.잠에 들지 않는다.  (쿨타임 0sec) -> st -0 clean +0 /n");

    while(1){
    printf("->");
    scanf("%d", &ans);

    if(ans == 1){
        av->st_g -= 15; av->sleep_g += 30;
        break;
    }else if(ans ==2 ){
        break;
    }else(
        printf("쿨타임 또는 잘못된 입력으로 인해 불가능합니다.\n");
    )
    }
}

void event_game(avata *av){
    //clock_t start, end;
    double longtime;
    int count = 0, count2 = 0;
    int event[3]={0,0,0};
    int event_num=0;
    //start = clock();
    Eat eating; malloc_eat(&eating);
    Exer exer; malloc_exercise(&exer);

    while(1){
        sleep(5);
        count=count+5;
        count2+=5;
        eat_cooltime(&eating);
        exer_cooltime(&exer);

        //end = clock();
        //longtime=((float)(end - start) / CLOCKS_PER_SEC);
        //printf("%.3f\n", longtime);
        printf("%d sec\n", count);
        //printf("%d\n", sr);
        if(count >= 40 ){
            count = 0;
            av->hp_g-=2;
            av->sleep_g-=2;
            av->clean_g-=1;
            print_gauge(av);
        }
        if(count2 >= 50){
            count2 =0;
            srand((unsigned)time(NULL));
            int sr = rand()% 4 + 1 ;
            if(sr == 1){
                event_one_exer(av, &exer);
            }else if(sr == 2){
                event_two_eat(av, &eating);
            }else if(sr == 3){
                event_three_wash(av);
            }else if(sr == 4){
                event_for_sleep(av);
            }
        }



    }
}

int main (void){

    avata Avatar;
    malloc_Ava(&Avatar);

    print_gauge(&Avatar);
    event_game(&Avatar);





    return 0;
}
