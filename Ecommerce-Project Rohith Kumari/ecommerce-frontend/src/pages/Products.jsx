import React from "react";
import headphoneImg from '../assets/WireLessHeadPhones.jpeg';
import smartwatch from '../assets/SmartWatch.jpeg';
import bluetoothspeaker from '../assets/BluetoothSpeaker.jpeg';
import gamingmouse from '../assets/GamingMouse.jpeg';
import mechanicalkeyboard from '../assets/MechanicalKeyBoard.jpeg';

const Products = ({ addToCart }) => {
  const products = [
    { id: 1, name: "Wireless Headphones", price: 2499, image: headphoneImg },
    { id: 2, name: "Smart Watch", price: 3499, image: smartwatch },
    { id: 3, name: "Bluetooth Speaker", price: 1999, image: bluetoothspeaker },
    { id: 4, name: "Gaming Mouse", price: 1499, image: gamingmouse },
    { id: 5, name: "Mechanical Keyboard", price: 2999, image: mechanicalkeyboard },
  ];

  return (
    <div style={styles.container}>
      <h1 style={styles.title}>Products</h1>
      <div style={styles.grid}>
        {products.map(product => (
          <div key={product.id} style={styles.card} className="product-card">
            <img src={product.image} alt={product.name} style={styles.image} />
            <h3>{product.name}</h3>
            <p style={styles.price}>₹{product.price}</p>
            <button style={styles.button} onClick={() => addToCart(product)}>Add to Cart</button>
          </div>
        ))}
      </div>
    </div>
  );
};

const styles = {
  container: { marginTop: "100px", textAlign: "center", color: "white", padding: "0 20px" },
  title: { fontSize: "28px", marginBottom: "30px" },
  grid: {
    display: "grid",
    gridTemplateColumns: "repeat(5, 1fr)", // desktop default
    gap: "30px",
  },
  card: {
    backgroundColor: "#1e293b",
    borderRadius: "12px",
    padding: "20px",
    boxShadow: "0 4px 12px rgba(0,0,0,0.3)",
    transition: "transform 0.3s ease, box-shadow 0.3s ease",
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    cursor: "pointer",
  },
  image: { width: "100%", height: "200px", objectFit: "cover", borderRadius: "8px", marginBottom: "15px" },
  price: { color: "#38bdf8", fontWeight: "600" },
  button: { backgroundColor: "#38bdf8", color: "#0f172a", border: "none", padding: "8px 16px", borderRadius: "6px", cursor: "pointer", fontWeight: "600", marginTop: "10px", transition: "all 0.3s ease" },
};

// Hover effects
const addHoverEffect = () => {
  const sheet = document.styleSheets[0];
  sheet.insertRule(`.product-card:hover { transform: scale(1.05); box-shadow: 0 8px 20px rgba(0,0,0,0.5); }`, sheet.cssRules.length);
  sheet.insertRule(`button:hover { background-color: #0ea5e9 !important; transform: scale(1.05); }`, sheet.cssRules.length);
};
addHoverEffect();

export default Products;
