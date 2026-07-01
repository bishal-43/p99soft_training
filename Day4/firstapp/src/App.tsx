import { useState } from 'react'

import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className='bg-gray-700'>
      <h1 className="text-5xl font-bold underline text-white">
        Hello world!
      </h1>
      <div>Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus, recusandae officia eum pariatur minima fuga nisi. Illum quam, ipsam ea nemo perferendis explicabo beatae, harum eos porro ipsa sit quia.</div>

      <button className=''>Click me</button>
    </div>


  )
}

export default App
