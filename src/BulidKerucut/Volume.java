package BulidKerucut;
public class Volume extends BangunRuang{
    float phi = 3.14f;
    float r;
    float t;
    float s;

    @Override
    float luas(){
        float a = r *(r + s);
        float luas = phi * a;
        System.out.println("Luas kerucut:" + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = 1/(float)3 * phi * r * r * t;
        System.out.println("Volume Kerucut: " + volume);
        return volume;
    }
}
