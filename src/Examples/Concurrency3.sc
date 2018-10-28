

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}

type TaxCut = String

object Government {
  def redeemCampaignPledge(): Future[TaxCut] = {
    val p = Promise[TaxCut]()
    Future {
      println("Starting the new legislative period.")
      Thread.sleep(2000)
      p.success(s"Hooray Bitches!")
      println("We reduced the taxes! You must reelect us!!!!1111")
    }
    p.future
  }
}