package Games.Engine;

public class SpriteList {
    public Sprite[][] list;
    public int filled_until;
    public SpriteList(){
        list = new Sprite[30][1000]; //Sprite[layer][place]
    }

    public void add_sprite(Sprite sprite, int layer){
        filled_until++;
        list[layer][filled_until-1] = sprite;
    }

    public void remove_sprite(Sprite sprite){
        boolean removed = false;
        for (Sprite[] layer : list){
            for (int index = 0; index < filled_until; index++){
                Sprite element = layer[index];
                if (element == sprite){
                    for (int index2 = index; index2 < filled_until; index2++)
                    {
                        Sprite next_element = layer[index2+1]; // sprite list elemente alle 1 in richtung anfang bewegen
                        layer[index2] = next_element;
                    }
                    removed = true;
                }
            }
            if (removed){
                layer[filled_until+1] = null;
            }

        }

    }

    public void print(){
        for (Sprite[] layer : list) {
            for (Sprite element : layer) {
                if (element != null){
                    element.print();
                }
            }
        }
    }
}
