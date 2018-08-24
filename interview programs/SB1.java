class SB1
{
public static void main(String... as)
{
StringBuffer game=new StringBuffer("");
game.insert(0,"Play");
game.insert(4,"With");
game.insert(8,"Pea");
game.insert(11,"Nuts");
game.delete(11, 15);
System.out.println(game);
}
}