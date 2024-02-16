// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineFindNetworkByEntityIdResponseJsonConverter))]
    public class G2engineFindNetworkByEntityIdResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Network Value { get; set; }
    }

    public class G2engineFindNetworkByEntityIdResponseJsonConverter : JsonConverter<G2engineFindNetworkByEntityIdResponse>
    {
        public override G2engineFindNetworkByEntityIdResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineFindNetworkByEntityIdResponse { Value = JsonSerializer.Deserialize<Network>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineFindNetworkByEntityIdResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Network>(writer, value.Value, options);
        }
    }
}
