// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EntitiesJsonConverter))]
    public class Entities
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<Entity> Value { get; set; }
    }

    public class EntitiesJsonConverter : JsonConverter<Entities>
    {
        public override Entities Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new Entities { Value = JsonSerializer.Deserialize<IList<Entity>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, Entities value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<Entity>>(writer, value.Value, options);
        }
    }
}
