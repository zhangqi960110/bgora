package com.pcassem.www.huaweithyj.work.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ProductEntity;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<ProductEntity.ListDataBean> mData;


    public ProductListAdapter(Context context, List<ProductEntity.ListDataBean> data) {
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<ProductEntity.ListDataBean> data) {
        this.mData = data;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_product, parent, false);

        view.setOnClickListener(this);
        return new ProductListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListAdapter.ViewHolder holder, final int position) {
        holder.categories.setText(mData.get(position).getCategories());
        holder.manufacturer.setText(mData.get(position).getManufacturer());
        holder.model.setText(mData.get(position).getModel());
        holder.itemView.setTag(mData.get(position).getPid());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setmOnItemClickListener(ProductListAdapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private ProductListAdapter.OnItemClickListener mOnItemClickListener = null;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView categories;
        private TextView manufacturer;
        private TextView model;

        public ViewHolder(View itemView) {
            super(itemView);
            categories = itemView.findViewById(R.id.categories);
            manufacturer = itemView.findViewById(R.id.manufacturer);
            model = itemView.findViewById(R.id.model);
        }
    }
}
