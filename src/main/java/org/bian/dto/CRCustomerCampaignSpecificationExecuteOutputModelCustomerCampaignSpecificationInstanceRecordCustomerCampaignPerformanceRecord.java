package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord
 */
public class CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord   {
  private CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference = null;


  /**
   * Get customerCampaignProcedureInstanceReference
   * @return customerCampaignProcedureInstanceReference
  **/

  public CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


}

