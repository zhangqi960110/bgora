package com.pcassem.www.huaweithyj.work.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.work.FaultConsultationActivity;

import java.util.List;

public class DeviceListAdapter extends RecyclerView.Adapter<DeviceListAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<DeviceEntity.ListDataBean> mData;


    public DeviceListAdapter(Context context, List<DeviceEntity.ListDataBean> data) {
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<DeviceEntity.ListDataBean> data){
        this.mData = data;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DeviceListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_device, parent, false);

        view.setOnClickListener(this);
        return new DeviceListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceListAdapter.ViewHolder holder, final int position) {

        holder.categories.setText(mData.get(position).getCategories());
        holder.model.setText("("+mData.get(position).getModel()+")");
        holder.manufacturer.setText(mData.get(position).getManufacturer());
        holder.code.setText(mData.get(position).getCode());
        holder.itemView.setTag(mData.get(position).getEid());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void setmOnItemClickListener(DeviceListAdapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private DeviceListAdapter.OnItemClickListener mOnItemClickListener = null;

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
        private TextView model;
        private TextView manufacturer;
        private TextView code;

        public ViewHolder(View itemView) {
            super(itemView);
            categories = itemView.findViewById(R.id.categories);
            model = itemView.findViewById(R.id.model);
            manufacturer = itemView.findViewById(R.id.manufacturer);
            code = itemView.findViewById(R.id.code);
        }
    }
}
