package id.putraprima.mygoldtracker.screen.harga;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

public class ImgItemProvider extends BaseItemProvider<ProviderMultiAdapter> {
    @Override
    public int getItemViewType() {
        return ProviderMultiAdapter.ImgItemProvider();
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, ProviderMultiAdapter providerMultiAdapter) {

    }
}
