package core.algebraicDataTypesAndPatternMatching.patternMatching.case2

/**
 * Created by ChenJinXin on 2021/6/29 上午10:03
 */
sealed class Coupon {
    companion object {
        final const val CashType = "CASH"
        final val DiscountType = "DISCOUNT"
        final val GiftType = "GIFT"

        private fun showUnAvilable() = {}
        private fun showExpired() = {}
        private fun showUsed() = {}
        private fun showFetched() = {}
        private fun showNotFetched() = {}

        fun showStatus(status: CouponStatus) = when (status) {
            is CouponStatus.StatusUnAvilable -> showUnAvilable()
            is CouponStatus.StatusExpired -> showExpired()
            is CouponStatus.StatusUsed -> showUsed()
            is CouponStatus.StatusFetched -> showFetched()
            is CouponStatus.StatusNotFetched -> showNotFetched()
        }

        sealed class CouponStatus {
            data class StatusNotFetched(val coupon: Coupon) : CouponStatus()//未领取
            data class StatusFetched(val coupon: Coupon, val user: User) : CouponStatus()//已领取但未使用
            data class StatusUsed(val coupon: Coupon, val user: User) : CouponStatus()//已使用
            data class StatusExpired(val coupon: Coupon) : CouponStatus()//已过期
            data class StatusUnAvilable(val coupon: Coupon) : CouponStatus()//无效优惠券
        }

        private fun fetched(coupon: Coupon, user: User): Boolean {
            return true
        } //根据用户信息和优惠券信息，判断某个用户是否领取了优惠券

        private fun used(coupon: Coupon, user: User): Boolean {
            return true
        } //根据用户信息和优惠券信息，判断优惠券是否已经被该用户使用

        private fun isExpired(coupon: Coupon): Boolean {
            return true
        } //判断优惠券是否过期

        private fun isUnAviable(coupon: Coupon): Boolean {
            return true
        } //判断优惠券是否已经失效

        fun getCouponStatus(coupon: Coupon, user: User): CouponStatus = when {
            isUnAviable(coupon) -> CouponStatus.StatusUnAvilable(coupon)//无效的优惠券
            isExpired(coupon) -> CouponStatus.StatusExpired(coupon)//过期的优惠券
            used(coupon, user) -> CouponStatus.StatusUsed(coupon, user)//被使用的优惠券
            fetched(coupon, user) -> CouponStatus.StatusFetched(coupon, user)//已领取未使用的优惠券
            else -> CouponStatus.StatusNotFetched(coupon)//未领取的优惠券
        }
    }

    class CashCoupon(val id: Long, val type: String, val leastCost: Long, val reduceCost: Long) : Coupon()
    class DiscountCoupon(val id: Long, val type: String, val discount: Int) : Coupon()
    class GiftCoupon(val id: Long, val type: String, val gift: String) : Coupon()
}