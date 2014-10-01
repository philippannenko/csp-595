package iit.csp595.domain.dao;

import iit.csp595.domain.Product;
import iit.csp595.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TempDB {

  public static Map<Long, Product> products = new HashMap<Long, Product>();
  public static List<Product> productsList = new ArrayList<Product>();
  public static Map<Long, User> users = new HashMap<Long, User>();
  public static Map<String, User> usersUsername = new HashMap<String, User>();

  private TempDB() {

  }

  public static void initDB() {
    System.out.println("initDB");
    products.clear();
    products
        .put(
            1l,
            new Product(
                1l,
                "Samsung Galaxy S5 16 GB",
                "The next big thing for business is here. Beyond the basics, the Samsung Galaxy S5 breaks boundaries with never-before integrated technology that improves productivity, enhances work-life balance and delivers a very secure mobile experience. Collaborate with colleagues more easily and securely than ever with this highly desirable smartphone featuring recently enhanced Samsung Knox compatibility.",
                "phone", 149.99));
    products
        .put(
            2l,
            new Product(
                2l,
                "Samsung Galaxy S4 16 GB",
                "The Galaxy S4 does what you want and what you didn't know was even possible. Erase a photo's background distractions with just a touch, catch every part of your son's somersault or capture your view of the city skyline. Skip channel surfing and change the TV channel right from your phone. Preview photos and files or read a news article without ever touching the screen. Use one screen to check Facebook as you catch up on email. The Galaxy S4 does things the way they should be done - your way. The smartphone camera just got a makeover. 13-megapixel meets 5\" 1080p display for a stunning way to take, view and share photos. Custom shooting modes make every moment beautiful, so you can capture the grandness of the Grand Canyon or document your daughter's first cartwheel. Erase the person who walked through your shot with one touch, or apply photo and video filters right from the camera. It\'s all a snap with the Galaxy S4 camera.",
                "phone", 79.99));
    products
        .put(
            3l,
            new Product(
                3l,
                "HTC One 32 GB",
                "With a sleek aluminum body, a live home screen that streams all of your favorite content, a photo gallery that comes to life, and dual frontal stereo speakers, HTC One is ready to reshape your smartphone experience.",
                "phone", 1D));
    products
        .put(
            4l,
            new Product(
                4l,
                "Motorola Droid Razr M 8 GB",
                "The big 4.3-inch display spans edge-to-edge, yet RAZR M still fits perfectly in the palm of your hand, making this one impossibly compact smartphone. Texting, emailing, reading, watching - it's all much easier to do when you have 40 percent more screen space than the leading competitor. And on a vibrant, high-resolution Super AMOLED Advanced display, everything looks amazing.",
                "phone", 118.99));
    products
        .put(
            5l,
            new Product(
                5l,
                "Samsung Galaxy Note 2 16 GB",
                "Looking for the smartphone that can do it all? The Galaxy Note II is a powerhouse of productivity. The S Pen bringsthe simplicity of pen and paper to innovative mobile technology, plus the ability to perform multiple tasks at once. Quickly create and edit documents, and navigate with the precision of a mouse. Use Air View to get an overview of an entire library by hovering the S Pen above the display, or boost your multitasking mileage: S Memo remembers shapes, text searches and even equations. Discover the advantage of lightning-fast load times, the luxury of a generous 5.5\" HD display and the beauty of Android 4.1, Jelly Bean. Featuring a cutting-edge quad-core processor, the Galaxy Note II takes on the hardest tasks - including video and complex graphics - with processing power to spare. Built for 4 G and featuring a 3100 mAh battery designed for extended power and super quick recharge times.",
                "phone", 49.99));
    products
        .put(
            6l,
            new Product(
                6l,
                "Apple iPhone 4 8 GB",
                "While everyone else was busy trying to keep up with iPhone, Apple were busy creating amazing new features that make iPhone more powerful, easier to use, and more indispensable than ever. The result is iPhone 4. The biggest thing to happen to iPhone since iPhone. All the breakthrough technology in iPhone 4 is situated between two glossy panels of aluminosilicate glass - the same type of glass used in the windshields of helicopters and high-speed trains. Chemically strengthened to be 20 times stiffer and 30 times harder than plastic, the glass is ultradurable and more scratch resistant than ever. It's also recyclable. The 960-by-640 backlit LCD display boasts a pixel density of 326 pixels per inch, making it the highest-resolution phone screen ever. To achieve this, Apple engineers developed pixels so small - a mere 78 micrometers across - that the human eye can't distinguish individual pixels. That makes text remarkably sharp and graphics incredibly vivid. IPS technology also provides excellent color and contrast from almost any viewing angle. Created from Apple's own alloy, then forged to be five times stronger than standard steel, the CNC-machined band is the mounting point for all the components of iPhone 4. The band provides impressive structural rigidity and allows for its incredibly thin, refined design. It also functions as both iPhone 4 antennas. Apple engineers designed the A4 chip to be a remarkably powerful yet remarkably power-efficient mobile processor. With it, iPhone 4 can easily perform complex jobs such as multitasking, editing video, and placing FaceTime calls. All while maximizing battery life. iPhone 4 includes a built-in three-axis gyroscope. When paired with the accelerometer, it makes iPhone 4 capable of advanced motion sensing such as user acceleration, full 3D attitude, and rotation rate. Translation: More motion gestures and greater precision for an even better gaming experience. The iPhone 4 camera shoots gorgeous 5-megapixel photos and stunning HD video. And with its advanced backside illumination sensor, it captures beautiful images even in low-light settings. The built-in LED flash does double duty. When you're taking pictures, it works as a flash. When you're shooting video it can stay on to light up the scene. And on the front of iPhone 4, the built-in camera is perfect for making FaceTime calls and shooting self-portraits. While most phones have only one microphone, iPhone 4 has two. The main mic, located on the bottom next to the dock connector, is for phone calls, voice commands, and memos. The second mic, built into the top near the headphone jack, is for FaceTime calls and for making your phone calls better. It works with the main mic to suppress unwanted and distracting background sounds, such as music and loud conversations. This dual-mic noise suppression helps make every conversation a quiet one. With its large Multi-Touch display and innovative software, iPhone lets you control everything using just your fingers. How does it work? A panel laminated on the glass senses your touch using electrical fields. It can register multiple touches at once to support advanced gestures such as pinch to zoom, two-finger tap, and more. The panel then transmits the information to the Retina display below it.",
                "phone", 129.99));

    users.clear();
    users.put(1l, new User(1l, "Philip", "Pannenko", "ppannenk", "password".toCharArray()));
    users.put(2l, new User(2l, "Zaharadeen", "Garuba", "zgaruba", "password".toCharArray()));
    users.put(3l, new User(3l, "James", "Murnane", "jmurnane", "password".toCharArray()));

    for (User u : users.values()) {
      usersUsername.put(u.getUsername(), u);
    }

    for (Product p : products.values()) {
      productsList.add(p);
    }
  }

}