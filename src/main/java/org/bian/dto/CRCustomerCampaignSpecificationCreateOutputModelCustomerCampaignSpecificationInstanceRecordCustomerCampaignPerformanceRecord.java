package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord
 */
public class CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord   {
  private CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference = null;


  /**
   * Get customerCampaignProcedureInstanceReference
   * @return customerCampaignProcedureInstanceReference
  **/

  public CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


}

