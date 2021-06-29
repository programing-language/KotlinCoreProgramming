package core.algebraicDataTypesAndPatternMatching.patternMatching.case2

/**
 * Created by ChenJinXin on 2021/6/29 上午10:46
 */
fun main() {
    val coupon = Coupon.CashCoupon(1,Coupon.CashType,2,3)
    val user = User()

    val couponStatus = Coupon.getCouponStatus(coupon, user)
    Coupon.showStatus(couponStatus)
}