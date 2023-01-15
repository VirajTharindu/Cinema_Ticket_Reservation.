var price = document.getElementById("amount").value;
//document.write(price);
paypal.Buttons({
    style : {
        color: 'blue',
        shape: 'pill'
    },
    createOrder: function (data, actions) {
        return actions.order.create({
            purchase_units : [{
                amount: {
                    value: price
                }
            }]
        });
    },
    onApprove: function (data, actions) {
        return actions.order.capture().then(function (details) {
            console.log(details)
            window.location.replace("http://localhost:8080/ABC_Cinema/bookings/success.jsp")
        })
    },
    onCancel: function (data) {
        window.location.replace("http://localhost:8080/ABC_Cinema/bookings/Oncancel.jsp")
    }
}).render('#paypal-payment-button');