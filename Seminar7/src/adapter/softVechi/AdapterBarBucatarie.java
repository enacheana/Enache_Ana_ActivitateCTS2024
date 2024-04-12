package adapter.softVechi;

import adapter.softNou.Bar;

public class AdapterBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void printareBon() {
        super.printareNotaDePlata();
    }

    @Override
    public void adaugareProdus(Produs produs) {

    }
}
