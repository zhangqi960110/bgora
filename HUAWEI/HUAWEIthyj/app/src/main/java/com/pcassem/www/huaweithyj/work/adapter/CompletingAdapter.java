package com.pcassem.www.huaweithyj.work.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;

import org.w3c.dom.Text;

import java.util.List;

public class CompletingAdapter extends RecyclerView.Adapter<CompletingAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<ServiceEntity.ListDataBean> mData;


    public CompletingAdapter(Context context, List<ServiceEntity.ListDataBean> data) {
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<ServiceEntity.ListDataBean> mData) {
        this.mData = mData;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CompletingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_completed, parent, false);

        view.setOnClickListener(this);
        return new CompletingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompletingAdapter.ViewHolder holder, final int position) {

        holder.company.setText(mData.get(position).getCompany());
        holder.expect_time.setText(mData.get(position).getExpect_time());
        if (mData.get(position).getService_type().equals("巡检服务")) {
            holder.lable1.setVisibility(View.VISIBLE);
            holder.lable2.setVisibility(View.GONE);
        } else {
            holder.lable1.setVisibility(View.GONE);
            holder.lable2.setVisibility(View.VISIBLE);
        }
        holder.itemView.setTag(mData.get(position).getSeid());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void setmOnItemClickListener(CompletingAdapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private CompletingAdapter.OnItemClickListener mOnItemClickListener = null;

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

        private TextView company;
        private TextView expect_time;
        private TextView lable1;
        private TextView lable2;

        public ViewHolder(View itemView) {
            super(itemView);
            company = itemView.findViewById(R.id.company);
            expect_time = itemView.findViewById(R.id.expect_time);
            lable1 = itemView.findViewById(R.id.lable1);
            lable2 = itemView.findViewById(R.id.lable2);
        }
    }
}
