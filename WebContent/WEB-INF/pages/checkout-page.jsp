<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<form action="cart?a=8" method="POST">
  <div class="col-10">
    <div class="row">
      <div class="col-6">

        <fieldset>
          <legend>Personal Information</legend>
          <input type="hidden" name="id" id="id" value="${requestScope.bean.item.id}">
          <label for="fname">First Name</label>
          <input type="text" name="fname" id="fname" value="${requestScope.bean.item.fname}">
          <label for="lname">Last Name</label>
          <input type="text" name="lname" id="lname" value="${requestScope.bean.item.lname}">
        </fieldset>
      </div>
      <div class="col-6">
        <fieldset>
          <legend>Shipping Address</legend>
          <label for="shippingAddress.street">Street</label>
          <input type="text" name="shippingAddress.street" id="shippingAddress.street" value="${requestScope.bean.item.shippingAddress.street}">
          <label for="city">City</label>
          <input type="text" name="shippingAddress.city" id="city" value="${requestScope.bean.item.shippingAddress.city}">
          <label for="zip">Zip</label>
          <input type="text" name="shippingAddress.zip" id="zip" value="${requestScope.bean.item.shippingAddress.zip}">
          <label for="state">State</label>
          <input type="text" name="shippingAddress.state" id="state" value="${requestScope.bean.item.shippingAddress.state}">
        </fieldset>
      </div>
    </div>
    <div class="row">
      <div class="col-6">
        <fieldset>
          <legend>Payment Method</legend>
          <label for="number">Number</label>
          <input type="text" name="paymentMethod.number" id="number" value="${requestScope.bean.item.paymentMethod.number}">
          <label for="name">Name on Card</label>
          <input type="text" name="paymentMethod.name" id="name" value="${requestScope.bean.item.paymentMethod.name}">
          <label for="expirationDate">Expiration</label>
          <input type="text" name="paymentMethod.expirationDate" id="expirationDate" value="${requestScope.bean.item.paymentMethod.expirationDate}">
          <label for="type">Type</label>
          <input type="text" name="paymentMethod.type" id="type" value="${requestScope.bean.item.paymentMethod.type}">
        </fieldset>
      </div>
      <div class="col-6">
        <fieldset>
          <legend>Billing Address</legend>
          <label for="street">Street</label>
          <input type="text" name="billingAddress.street" id="street" value="${requestScope.bean.item.billingAddress.street}">
          <label for="city">City</label>
          <input type="text" name="billingAddress.city" id="city" value="${requestScope.bean.item.billingAddress.city}">
          <label for="zip">Zip</label>
          <input type="text" name="billingAddress.zip" id="zip" value="${requestScope.bean.item.billingAddress.zip}">
          <label for="state">State</label>
          <input type="text" name="billingAddress.state" id="state" value="${requestScope.bean.item.billingAddress.state}">

        </fieldset>
      </div>
    </div>
  </div>


  <div class="col-2 sidebar">
    <fieldset>
      <legend>Checkout</legend>
      <ol class="list-unstyled">
        <li><button style="width: 100%;" type="submit">Confirm Order</button></li>
      </ol>
    </fieldset>
  </div>
</form>

