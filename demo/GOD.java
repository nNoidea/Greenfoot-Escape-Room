import greenfoot.*;

// God zal elke kamer bevatten. Als je een kamer wilt toevegen, creer eerst voor uw kamer een klasse
// die de `World` klass extend.
// Gebruik daarachter`public static World *kamer_naam* = new RoomX()` om die kamer globaal
// beschikbaar te stellen.
// Rooms mogen GEEN gamemechanics codes bevatten.


public class GOD extends World
{
    
    public GOD()
    {
        super(1200, 700, 1);
    }
    
    boolean force_switch = true;
    public void act()
    {
        if(force_switch)
        {
            Greenfoot.setWorld(new Room1Oguz());    // changes the room to the cooresponding room
                                                    // that is given as an argument. Use the same
                                                    // function with different rooms to switch
                                                    // between them.
            force_switch= false;
        }
    }
}
