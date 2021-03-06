/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.sagacity.sqltoy.config.annotation.OneToMany;
import java.util.List;
import java.util.ArrayList;
import com.sagframe.sqltoy.showcase.vo.ComplexpkItemVO;

/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_complexpk_head,Remark:复合主键级联操作主表  
 */
@Entity(tableName="sqltoy_complexpk_head",pk_constraint="PRIMARY")
public abstract class AbstractComplexpkHeadVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //transDate,transCode,totalCnt,totalAmt,createBy,createTime,updateBy,updateTime
	 
	 //not null properties
	 //transDate,transCode,totalCnt,totalAmt,createBy,createTime,updateBy,updateTime

	/**
	 * 
	 */
	private static final long serialVersionUID = 316650102211772623L;
	
	/**
	 * 交易日期
	 */
	@Id
	@Column(name="TRANS_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate transDate;
	
	/**
	 * 业务代码
	 */
	@Id
	@Column(name="TRANS_CODE",length=30L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transCode;
	
	/**
	 * 总数量
	 */
	@Column(name="TOTAL_CNT",length=12L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal totalCnt;
	
	/**
	 * 总金额
	 */
	@Column(name="TOTAL_AMT",length=12L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal totalAmt;
	
	/**
	 * 创建人
	 */
	@Column(name="CREATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String createBy;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	
	/**
	 * 最后修改人
	 */
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * 最后修改时间
	 */
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	

	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields={"transDate","transCode"},mappedTable="sqltoy_complexpk_item",mappedColumns={"TRANS_DATE","TRANS_CODE"},mappedFields={"transDate","transCode"})
	protected List<ComplexpkItemVO> complexpkItemVOs=new ArrayList<ComplexpkItemVO>();

	/** default constructor */
	public AbstractComplexpkHeadVO() {
	}
	
	/** pk constructor */
	public AbstractComplexpkHeadVO(LocalDate transDate,String transCode)
	{
		this.transDate=transDate;
		this.transCode=transCode;
	}


	/** full constructor */
	public AbstractComplexpkHeadVO(LocalDate transDate,String transCode,BigDecimal totalCnt,BigDecimal totalAmt,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime)
	{
		this.transDate=transDate;
		this.transCode=transCode;
		this.totalCnt=totalCnt;
		this.totalAmt=totalAmt;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
	}
	
	/**
	 *@param transDate the transDate to set
	 */
	public AbstractComplexpkHeadVO setTransDate(LocalDate transDate) {
		this.transDate=transDate;
		return this;
	}
		
	/**
	 *@return the TransDate
	 */
	public LocalDate getTransDate() {
	    return this.transDate;
	}
	
	/**
	 *@param transCode the transCode to set
	 */
	public AbstractComplexpkHeadVO setTransCode(String transCode) {
		this.transCode=transCode;
		return this;
	}
		
	/**
	 *@return the TransCode
	 */
	public String getTransCode() {
	    return this.transCode;
	}
	
	/**
	 *@param totalCnt the totalCnt to set
	 */
	public AbstractComplexpkHeadVO setTotalCnt(BigDecimal totalCnt) {
		this.totalCnt=totalCnt;
		return this;
	}
		
	/**
	 *@return the TotalCnt
	 */
	public BigDecimal getTotalCnt() {
	    return this.totalCnt;
	}
	
	/**
	 *@param totalAmt the totalAmt to set
	 */
	public AbstractComplexpkHeadVO setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt=totalAmt;
		return this;
	}
		
	/**
	 *@return the TotalAmt
	 */
	public BigDecimal getTotalAmt() {
	    return this.totalAmt;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public AbstractComplexpkHeadVO setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public AbstractComplexpkHeadVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public AbstractComplexpkHeadVO setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public AbstractComplexpkHeadVO setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
		return this;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}


	/**
	 * @return the complexpkItemVOs
	 */
	public List<ComplexpkItemVO> getComplexpkItemVOs() {
		return this.complexpkItemVOs;
	}
	
	public void setComplexpkItemVOs(List<ComplexpkItemVO> complexpkItemVOs)	{
		this.complexpkItemVOs=complexpkItemVOs;
	}

	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("transDate=").append(getTransDate()).append("\n");
		columnsBuffer.append("transCode=").append(getTransCode()).append("\n");
		columnsBuffer.append("totalCnt=").append(getTotalCnt()).append("\n");
		columnsBuffer.append("totalAmt=").append(getTotalAmt()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		return columnsBuffer.toString();
	}
}
