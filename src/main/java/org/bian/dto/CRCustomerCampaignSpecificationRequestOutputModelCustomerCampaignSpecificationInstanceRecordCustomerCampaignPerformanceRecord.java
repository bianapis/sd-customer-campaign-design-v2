package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord
 */
public class CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord   {
  private CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference = null;


  /**
   * Get customerCampaignProcedureInstanceReference
   * @return customerCampaignProcedureInstanceReference
  **/

  public CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


}

