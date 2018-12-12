package com.pcassem.www.huaweithyj.news.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.NewsEntity;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<NewsEntity.ListDataBean> mData;


    public NewsAdapter(Context context,List<NewsEntity.ListDataBean> data){
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<NewsEntity.ListDataBean> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_news,parent,false);

        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.company.setText(mData.get(position).getCompany());
        holder.name.setText(mData.get(position).getName());
        holder.phone.setText(mData.get(position).getPhone());
        if (mData.get(position).getService_type().equals("巡检服务")){
            holder.lable1.setVisibility(View.VISIBLE);
            holder.lable2.setVisibility(View.GONE);
        }else {
            holder.lable1.setVisibility(View.GONE);
            holder.lable2.setVisibility(View.VISIBLE);
        }
        holder.itemView.setTag(mData.get(position).getSeid());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private OnItemClickListener mOnItemClickListener = null;

    public interface OnItemClickListener {
        void onItemClick(View view,int position);
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null){
            mOnItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView company;
        private TextView name;
        private TextView phone;
        private TextView lable1;
        private TextView lable2;

        public ViewHolder(View itemView) {
            super(itemView);
            company = itemView.findViewById(R.id.company);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);
            lable1 = itemView.findViewById(R.id.lable1);
            lable2 = itemView.findViewById(R.id.lable2);
        }
    }
}
