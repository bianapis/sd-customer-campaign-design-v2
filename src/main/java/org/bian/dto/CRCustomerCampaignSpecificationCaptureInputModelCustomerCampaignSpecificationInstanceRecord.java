package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord
 */
public class CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecord   {
  private CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord = null;


  /**
   * Get customerCampaignPerformanceRecord
   * @return customerCampaignPerformanceRecord
  **/

  public CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord getCustomerCampaignPerformanceRecord() {
    return customerCampaignPerformanceRecord;
  }

  public void setCustomerCampaignPerformanceRecord(CRCustomerCampaignSpecificationCaptureInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord) {
    this.customerCampaignPerformanceRecord = customerCampaignPerformanceRecord;
  }


}

