# Simple-Java-Card-Game 
<br>

### (Java - card game explain detailed for github project as readme)

<br>

Today,I'm gonna show you simple java card game has writed by me also i will illustare it's features and logic.

<br>

This game has depended by basic of object oriented programming so my instructor has given this game to me as assigment to learn basics of oop.

<br>

If I mention about the basic rules and other detailes of game, the card game consist of two players as User(human) and pc(computer).
User is person playing the game.Game will progress according to User , because if User chose a basketboller card , pc has to throw one basketboller card from its cards.In other words user merge the game and pc depends to user.

<br>


<b> Each user has 8 sportsman card and the 8 cards should be consist of 4 footballer and 4 basketboller card. </b>

In other words , each user should be has 4 footballer and 4 basketboller cards. These cards have distributed from program to users randomly. //This event has needed to be realize

Namely , user should be see distinct cards when run program.

<b> Despite, computer's cards should seems cover.User should not see from computer's card. </b>

<img src="/img/image_1.png" height="600" width="1000">


Also , footballer and basketboller have distinct features that special for their branches.Such as an footballer card has shoot percentage as features and basketboller card has Field Goal Percentage as features .eg.

The game will progress according to this features , As warning that choosen card (basketboller ,footballer) should be compare itself kind.Namely basketboller card should not be compare footballer card or else, programmer does not allow this bug.

<img src="/img/image_2.png" height = "300" width = "400">

## How to play

User choose one card from its card , after that pc throw card that kind of user's card. When user chose card , action has triggered , and features has detected randomly.

Assume that user has chosed basketboller card Lebron,after that pc has chosed one basketboller card Doncic.
And feature has detected now,Such as "Field Goal Percentage" has chosed,then , when user should be push the "play" button ,
program compares two cards according to choosen features. 
Then it shows result as notice message.Such as "User won".Then user take 10 points. Game advances like this.



<img src="/img/image_3.png" height = "600" width = "1000">


## Framework of this project and UML diagram

This project consist of two parent classes.These are "Sporcu.class" and "Oyuncu.class"

`sporcu-sportsmen`
`Oyuncu-player`

- Other subclasses inherit from parent classes.
- Such as basketbolcu.class and futbolcu.class inherit from Sporcu.class
- Such as KullaniciSinifi.class and BilgisayarKullanicisi.class inherit from Oyuncu.class

<img src="/img/uml.png" height = "600" width = "1000">
