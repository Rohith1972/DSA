import React from "react";

const Cart = ({ cart, removeFromCart }) => {
  const total = cart.reduce((sum, item) => sum + item.price * item.quantity, 0);

  return (
    <div className="cart-container">
      <h1 className="cart-title">Your Cart</h1>
      {cart.length === 0 ? (
        <p>Your cart is empty.</p>
      ) : (
        <div className="cart-grid">
          {cart.map(item => (
            <div key={item.id} className="cart-card">
              <img src={item.image} alt={item.name} className="cart-image" />
              <h3>{item.name}</h3>
              <p>Price: ₹{item.price}</p>
              <p>Quantity: {item.quantity}</p>
              <button 
                className="remove-button" 
                onClick={() => removeFromCart(item.id)}
              >
                Remove
              </button>
            </div>
          ))}
        </div>
      )}
      {cart.length > 0 && <h2 className="cart-total">Total: ₹{total}</h2>}
      
      <style>{`
        .cart-container {
          padding: 20px;
          color: white;
        }
        
        .cart-title {
          text-align: center;
          margin-bottom: 20px;
        }
        
        .cart-grid {
          display: grid;
          gap: 20px;
          grid-template-columns: repeat(3, 1fr);
        }
        
        .cart-card {
          background-color: #1e293b;
          padding: 15px;
          border-radius: 12px;
          text-align: center;
          box-shadow: 0 4px 12px rgba(0,0,0,0.3);
        }
        
        .cart-image {
          width: 150px;
          height: 150px;
          object-fit: cover;
          border-radius: 8px;
          margin-bottom: 10px;
        }
        
        .remove-button {
          background-color: #ef4444;
          color: white;
          border: none;
          padding: 8px 12px;
          border-radius: 6px;
          cursor: pointer;
          font-weight: 600;
          margin-top: 10px;
          transition: all 0.3s ease;
        }
        
        .remove-button:hover {
          background-color: #dc2626;
        }
        
        .cart-total {
          margin-top: 30px;
          text-align: center;
          color: #38bdf8;
        }
        
        /* Tablet - 2 columns */
        @media (max-width: 1024px) {
          .cart-grid {
            grid-template-columns: repeat(2, 1fr);
          }
        }
        
        /* Mobile - 1 column */
        @media (max-width: 640px) {
          .cart-grid {
            grid-template-columns: repeat(1, 1fr);
          }
          
          .cart-image {
            width: 120px;
            height: 120px;
          }
        }
      `}</style>
    </div>
  );
};

export default Cart;