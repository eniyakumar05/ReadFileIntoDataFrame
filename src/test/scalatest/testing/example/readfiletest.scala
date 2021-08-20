package testing.example

import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.apache.spark
import org.apache.spark.sql._
import org.scalatest.{FunSuite, FunSpec}


class readfiletest extends FunSuite with DataFrameSuiteBase {

  implicit val sparkImpl: SparkSession = spark
  var app: readfiletest = new readfiletest()

  override def beforeAll() {
    super.beforeAll()
    super.sqlBeforeAllTestCases()
  }

  test("Your test") {
    val df = app.readfiletest(sparkImpl)
    assert(df.isInstanceOf[DataFrame])
  }
}