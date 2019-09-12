package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord
 */
public class CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord   {
  private CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord = null;


  /**
   * Get customerCampaignPerformanceRecord
   * @return customerCampaignPerformanceRecord
  **/

  public CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord getCustomerCampaignPerformanceRecord() {
    return customerCampaignPerformanceRecord;
  }

  public void setCustomerCampaignPerformanceRecord(CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord) {
    this.customerCampaignPerformanceRecord = customerCampaignPerformanceRecord;
  }


}

