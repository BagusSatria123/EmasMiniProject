package id.putraprima.mygoldtracker.screen.harga;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;

import org.jetbrains.annotations.NotNull;

import java.security.Provider;
import java.util.List;

public class ProviderMultiAdapter extends BaseProviderMultiAdapter<ProviderMultiAdapter> {

    public int IMG;
    String TEXT;
    public int IMG_TEXT;


    public ProviderMultiAdapter() {
        super();
        addItemProvider(new ImgItemProvider());
        addItemProvider(new TextImgItemProvider());
        addItemProvider(new TextItemProvider());
    }
    @Override
    protected int getItemType(@NotNull List<? extends ProviderMultiAdapter> data, int position) {
        switch (position % 3) {
            case 0:
                return ProviderMultiAdapter.IMG;
            case 1:
                return ProviderMultiAdapter.TEXT;
            case 2:
                return ProviderMultiAdapter.IMG_TEXT;
            default:
                break;
        }
        return 0;
    }
}
