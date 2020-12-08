package id.putraprima.mygoldtracker.screen.harga;

import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import id.putraprima.mygoldtracker.R;

public class DataBindingAdapter extends BaseQuickAdapter<HargaAdapter, BaseViewHolder> {

    private HargaAdapter mHarga = new HargaAdapter();
    private HargaAdapter item;

    public DataBindingAdapter(int layoutResId) {
        super(R.layout.fragment_harga);
    }

    @Override
    protected void onItemViewHolderCreated(@NotNull BaseViewHolder viewHolder, int viewType) {
        DataBindingUtil.bind(viewHolder.itemView);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, HargaAdapter item) {
        if (item == null) {
            return;
        }

        DataBindingUtil helper = null;
        DataBindingAdapter binding = helper.getBinding();
        if (binding != null) {
            // 设置数据
            binding.setMovie(item);
            binding.setPresenter(mPresenter);
            binding.executePendingBindings();
        }
    }

    private void setMovie(HargaAdapter item) {
        this.item = item;
    }
}
